package com.test.mylifegoale.data;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public final class APIService {

    public static class Urgh {
        public final String test;

        public Urgh(String test) {
            this.test = test;
        }
    }

    public static class LoginResponse {
        public final String id;
        public final String firstName;
        public final String lastName;
        public final String email;
        public final Boolean isVerified;
        public final JWTToken jwt;
        public final String error;

        public LoginResponse(String id, String firstName, String lastName, String email, Boolean isVerified, JWTToken jwt, String error) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.isVerified = isVerified;
            this.jwt = jwt;
            this.error = error;
        }
    }

    public static class JWTToken {
        public final String accessToken;

        public JWTToken(String accessToken) {
            this.accessToken = accessToken;
        }
    }


    public static class LoginRequest {
        public final String login;
        public final String password;
        public LoginRequest(String login, String password) {
            this.login = login;
            this.password = password;
        }
    }
    public interface API {
        @GET("/test")
        Call<Urgh> test();

        @POST("/api/login")
        Call<LoginResponse> login(
                @Body LoginRequest user
        );

        // @TODO prefix with /api
        @POST("/api/register")
        Call<LoginResponse> register(
//                @Body("firstName") String firstName,
//                @Body("lastName") String lastName,
//                @Body("email") String email,
//                @Body("password") String password
          );
//
//        //keep using <LoginResponse> ?
//        @POST("/api/fr-request")
//        Call<LoginResponse> performFriendRequest(
//                @Path("senderId") String senderId,
//                @Path("login") String username
//        );
//
//        @POST("/api/fr-response")
//        Call<LoginResponse> allowFriendRequest(
//                @Path("userID") String userID,
//                @Path("friendID") String friendID,
//                @Path("status")String status
//        );
//
//        @POST("/api/fr-remove")
//        Call<LoginResponse> removeFriend(
//                @Path("userId") String userId,
//                @Path("friendId") String friendId
//        );
//
//        @POST("/api/fr-allfriends")
//        Call<LoginResponse> showAllFriends(
//                @Path("userID") String userID
//        );
//
//        @POST("/api/add-bucket")
//        Call<LoginResponse> addItemBucket(
//                @Path("userID") String userID,
//                @Path("itemTitle") String itemTitle,
//                @Path("caption") String caption
//        );
//
//        @POST("/api/all-buckets")
//        Call<LoginResponse> showAllbucket(
//                @Path("userID") String userID
//        );
//
//        @POST("/api/delete-bucket")
//        Call<LoginResponse> deleteItemBucket(
//                @Path("ID") String ID
//        );
//
//        @POST("/api/edit-bucket")
//        Call<LoginResponse> editItemBucket(
//                @Path("ID") String ID,
//                @Path("itemTitle") String ItemTile,
//                @Path("caption") String caption,
//                @Path("completed") String completed
//        );
//
//        @POST("/api/add-todo")
//        Call<LoginResponse> addItemTodo(
//                @Path("userID") String userID,
//                @Path("itemTitle") String itemTitle
//        );
//
//        @POST("/api/all-todo")
//        Call<LoginResponse> showAllTodo(
//                @Path("userID") String userID
//        );
//
//        @POST("/api/delete-todo")
//        Call<LoginResponse> deleteItemTodo(
//                @Path("ID") String ID
//        );
//
//        @POST("/api/edit-todo")
//        Call<LoginResponse> editItemTodo(
//                @Path("ID") String ID,
//                @Path("itemTitle") String itemTitle,
//                @Path("completed") String completed
//        );
//
//        @POST("/api/mark-completed-todo")
//        Call<LoginResponse> completedTodo(
//                @Path("itemTitle") String itemTitle,
//                @Path("userID") String userID,
//                @Path("completed") String completed
//        );
    }
}