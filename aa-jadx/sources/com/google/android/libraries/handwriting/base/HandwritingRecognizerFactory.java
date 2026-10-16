package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class HandwritingRecognizerFactory {
    private static final java.lang.String TAG = "HWRFactory";

    private static java.lang.String adjustName(java.lang.String str) {
        if (str.contentEquals("com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizer")) {
            str = "com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerWithProto";
        } else if (str.contentEquals("com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizer")) {
            str = "com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerWithProto";
        } else if (str.contentEquals("com.google.android.libraries.handwriting.classifiers.SingleCharRecognizerJNI")) {
            str = "com.google.android.libraries.handwriting.classifiers.SingleCharRecognizerJNIWithProto";
        } else if (str.contentEquals("com.google.android.libraries.handwriting.classifiers.WordRecognizerJNI")) {
            str = "com.google.android.libraries.handwriting.classifiers.WordRecognizerJNIWithProto";
        } else if (str.contentEquals("com.google.android.libraries.handwriting.classifiers.LSTMRecognizerJNI")) {
            str = "com.google.android.libraries.handwriting.classifiers.LSTMRecognizerJNIWithProto";
        }
        android.util.Log.i(TAG, "name = ".concat(java.lang.String.valueOf(str)));
        return str;
    }

    public static com.google.android.libraries.handwriting.base.HandwritingRecognizer create(defpackage.abxz abxzVar, android.content.Context context) {
        try {
            com.google.android.libraries.handwriting.base.HandwritingRecognizer handwritingRecognizer = (com.google.android.libraries.handwriting.base.HandwritingRecognizer) java.lang.Class.forName(adjustName(abxzVar.d)).getConstructor(defpackage.abxz.class, android.content.Context.class).newInstance(abxzVar, context);
            if ((abxzVar.b & 1024) != 0) {
                defpackage.abxz abxzVar2 = abxzVar.k;
                if (abxzVar2 == null) {
                    abxzVar2 = defpackage.abxz.a;
                }
                handwritingRecognizer.setSecondaryRecognizer(create(abxzVar2, context));
            }
            return handwritingRecognizer;
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.e(TAG, "ClassNotFoundException", e);
            return null;
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e(TAG, "IllegalAccessException", e2);
            return null;
        } catch (java.lang.IllegalArgumentException e3) {
            android.util.Log.e(TAG, "IllegalArgumentException", e3);
            return null;
        } catch (java.lang.InstantiationException e4) {
            android.util.Log.e(TAG, "InstantiationException", e4);
            return null;
        } catch (java.lang.NoSuchMethodException e5) {
            android.util.Log.e(TAG, "NoSuchMethodException", e5);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e6) {
            android.util.Log.e(TAG, "InvocationTargetException", e6);
            return null;
        }
    }

    public static com.google.android.libraries.handwriting.base.HandwritingRecognizer create(defpackage.abxz abxzVar) {
        try {
            com.google.android.libraries.handwriting.base.HandwritingRecognizer handwritingRecognizer = (com.google.android.libraries.handwriting.base.HandwritingRecognizer) java.lang.Class.forName(adjustName(abxzVar.d)).getConstructor(defpackage.abxz.class).newInstance(abxzVar);
            if ((abxzVar.b & 1024) != 0) {
                defpackage.abxz abxzVar2 = abxzVar.k;
                if (abxzVar2 == null) {
                    abxzVar2 = defpackage.abxz.a;
                }
                handwritingRecognizer.setSecondaryRecognizer(create(abxzVar2));
            }
            return handwritingRecognizer;
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.e(TAG, "ClassNotFoundException", e);
            return null;
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e(TAG, "IllegalAccessException", e2);
            return null;
        } catch (java.lang.IllegalArgumentException e3) {
            android.util.Log.e(TAG, "IllegalArgumentException", e3);
            return null;
        } catch (java.lang.InstantiationException e4) {
            android.util.Log.e(TAG, "InstantiationException", e4);
            return null;
        } catch (java.lang.NoSuchMethodException e5) {
            android.util.Log.e(TAG, "NoSuchMethodException", e5);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e6) {
            android.util.Log.e(TAG, "InvocationTargetException", e6);
            return null;
        }
    }
}
