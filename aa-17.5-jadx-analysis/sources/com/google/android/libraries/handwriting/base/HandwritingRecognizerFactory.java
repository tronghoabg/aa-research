package com.google.android.libraries.handwriting.base;

import android.content.Context;
import android.util.Log;
import defpackage.abww;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class HandwritingRecognizerFactory {
    private static final String TAG = "HWRFactory";

    private static String adjustName(String str) {
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
        Log.i(TAG, "name = ".concat(String.valueOf(str)));
        return str;
    }

    public static HandwritingRecognizer create(abww abwwVar, Context context) {
        try {
            HandwritingRecognizer handwritingRecognizer = (HandwritingRecognizer) Class.forName(adjustName(abwwVar.d)).getConstructor(abww.class, Context.class).newInstance(abwwVar, context);
            if ((abwwVar.b & 1024) != 0) {
                abww abwwVar2 = abwwVar.k;
                if (abwwVar2 == null) {
                    abwwVar2 = abww.a;
                }
                handwritingRecognizer.setSecondaryRecognizer(create(abwwVar2, context));
            }
            return handwritingRecognizer;
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "IllegalAccessException", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            Log.e(TAG, "IllegalArgumentException", e3);
            return null;
        } catch (InstantiationException e4) {
            Log.e(TAG, "InstantiationException", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e(TAG, "NoSuchMethodException", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e(TAG, "InvocationTargetException", e6);
            return null;
        }
    }

    public static HandwritingRecognizer create(abww abwwVar) {
        try {
            HandwritingRecognizer handwritingRecognizer = (HandwritingRecognizer) Class.forName(adjustName(abwwVar.d)).getConstructor(abww.class).newInstance(abwwVar);
            if ((abwwVar.b & 1024) != 0) {
                abww abwwVar2 = abwwVar.k;
                if (abwwVar2 == null) {
                    abwwVar2 = abww.a;
                }
                handwritingRecognizer.setSecondaryRecognizer(create(abwwVar2));
            }
            return handwritingRecognizer;
        } catch (ClassNotFoundException e) {
            Log.e(TAG, "ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "IllegalAccessException", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            Log.e(TAG, "IllegalArgumentException", e3);
            return null;
        } catch (InstantiationException e4) {
            Log.e(TAG, "InstantiationException", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e(TAG, "NoSuchMethodException", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e(TAG, "InvocationTargetException", e6);
            return null;
        }
    }
}
