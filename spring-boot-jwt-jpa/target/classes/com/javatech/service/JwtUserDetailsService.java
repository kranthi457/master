Êþº¾   4 e  +com/javainuse/service/JwtUserDetailsService  java/lang/Object  @org/springframework/security/core/userdetails/UserDetailsService userDao Lcom/javainuse/dao/UserDao; RuntimeVisibleAnnotations 8Lorg/springframework/beans/factory/annotation/Autowired; 
bcryptEncoder >Lorg/springframework/security/crypto/password/PasswordEncoder; <init> ()V Code
   
  LineNumberTable LocalVariableTable this -Lcom/javainuse/service/JwtUserDetailsService; loadUserByUsername O(Ljava/lang/String;)Lorg/springframework/security/core/userdetails/UserDetails; 
Exceptions  Gorg/springframework/security/core/userdetails/UsernameNotFoundException	         com/javainuse/dao/UserDao ! " findByUsername 1(Ljava/lang/String;)Lcom/javainuse/model/DAOUser; $ java/lang/StringBuilder & User not found with username: 
 # ( 
 ) (Ljava/lang/String;)V
 # + , - append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 # / 0 1 toString ()Ljava/lang/String;
  ( 4 2org/springframework/security/core/userdetails/User
 6 8 7 com/javainuse/model/DAOUser 9 1 getUsername
 6 ; < 1 getPassword > java/util/ArrayList
 = 
 3 A 
 B =(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V username Ljava/lang/String; user Lcom/javainuse/model/DAOUser; 
StackMapTable save <(Lcom/javainuse/model/UserDTO;)Lcom/javainuse/model/DAOUser;
 6 
 L 8 M com/javainuse/model/UserDTO
 6 O P ) setUsername	  R  
 L ; U W V <org/springframework/security/crypto/password/PasswordEncoder X Y encode ,(Ljava/lang/CharSequence;)Ljava/lang/String;
 6 [ \ ) setPassword  ^ H _ &(Ljava/lang/Object;)Ljava/lang/Object; Lcom/javainuse/model/UserDTO; newUser 
SourceFile JwtUserDetailsService.java (Lorg/springframework/stereotype/Service; !          	     
       	     
     
      /     *· ±                                     ž     >*´ +¹  M,Ç » Y» #Y%· '+¶ *¶ .· 2¿» 3Y,¶ 5,¶ :» =Y· ?· @°                '   3 ! :           >       > C D   3 E F  G    ü ' 6  H I     y     /» 6Y· JM,+¶ K¶ N,*´ Q+¶ S¹ T ¶ Z*´ ,¹ ] À 6°           %  &  ' ! (         /       / E `   ' a F   b    c 	     d  
