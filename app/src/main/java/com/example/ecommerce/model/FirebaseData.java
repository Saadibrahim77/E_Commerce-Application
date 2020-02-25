package com.example.ecommerce.model;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.ecommerce.model.entities.ProductCategoryModel;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class FirebaseData {

   /* FirebaseFirestore firestore;
    StorageReference mStorageRef ;

    public FirebaseData() {

        firestore = FirebaseFirestore.getInstance();
        mStorageRef = FirebaseStorage.getInstance().getReference("Images");

    }


    public void add_Categoris()
    {
        ProductCategoryModel productCategoryModel =new ProductCategoryModel(
                "Electronic",
                "Electric Items",
                "10%",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeNSONF3fr9bZ6g0ztTAIPXPRCYN9vtKp1dXQB2UnBm8n5L34r");

        firestore.collection("Categories")
                .document("Electronic").set(productCategoryModel).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });



        ProductCategoryModel productCategoryModel1 = new ProductCategoryModel(
                "Furnitures",
                "Furnitures Items",
                "15%",
                "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRaUR5_wzLgBOuNtkWjOxhgaYaPBm821Hb_71xTyQ-OdUd-ojMMvw");

        firestore.collection("Categories")
                .document("Electronic").set(productCategoryModel).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });




    }




    private String getFileExtension(Uri uri) {
        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }

    private void uploadFile(Uri ImageProfile) {
        if (ImageProfile != null) {
            final StorageReference fileReference = mStorageRef.child(System.currentTimeMillis()
                    + "." + getFileExtension(ImageProfile));


            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Uploading");
            progressDialog.setCancelable(false);
            progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    progressDialog.dismiss();//dismiss dialog
                    circleImageView.setImageResource(R.drawable.user);
                    if(uploadTask.isComplete())
                    {

                        fileReference.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                Toast.makeText(SIGN_UP.this, "Delete Success", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(SIGN_UP.this, "Not Delete", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                    else
                    {
                        uploadTask.cancel();
                        Toast.makeText(SIGN_UP.this, "Upload Canceled", Toast.LENGTH_SHORT).show();
                    }


                }
            });

            progressDialog.show();



            uploadTask =   fileReference.putFile(ImageProfile);
            uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                    progressDialog.dismiss();

                    fileReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {

                            ImageProfileUri = uri;



                        }
                    });
                    //Toast.makeText(MessageActivity.this, "Upload successful", Toast.LENGTH_LONG).show();

                }
            })      .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(SIGN_UP.this, e.getMessage(), Toast.LENGTH_LONG).show();

                }
            })  .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
                    //calculating progress percentage
                    double progress = (100.0 * taskSnapshot.getBytesTransferred()) / taskSnapshot.getTotalByteCount();

                    //displaying percentage in progress dialog
                    progressDialog.setMessage("Uploaded " + ((int) progress) + "%...");

                }
            });


        } else {
            Toast.makeText(this, "No file selected", Toast.LENGTH_SHORT).show();
        }


    }


*/


}
