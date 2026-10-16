package com.google.android.libraries.handwriting.classifiers;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.handwriting.base.OnDeviceSpecUtils;
import com.google.android.libraries.handwriting.classifiers.WordRecognizerJNI;
import defpackage.a;
import defpackage.abww;
import defpackage.abxd;
import defpackage.abxf;
import java.io.IOException;

/* loaded from: classes3.dex */
public class WordRecognizerJNIWithProto extends WordRecognizerJNI {
    private static final String TAG = "HWRWordRecoJNIProto";

    public static class WordRecognizerJNIWithProtoSettings extends WordRecognizerJNI.WordRecognizerJNISettings {
        /* JADX WARN: Illegal instructions before constructor call */
        public WordRecognizerJNIWithProtoSettings(abww abwwVar) {
            int i;
            abxf abxfVar = abwwVar.j;
            String str = (abxfVar == null ? abxf.a : abxfVar).c;
            abxf abxfVar2 = abwwVar.j;
            String lmFileFromWordSpec = WordRecognizerJNIWithProto.getLmFileFromWordSpec(abxfVar2 == null ? abxf.a : abxfVar2);
            abxf abxfVar3 = abwwVar.j;
            String wlFileFromWordSpec = WordRecognizerJNIWithProto.getWlFileFromWordSpec(abxfVar3 == null ? abxf.a : abxfVar3);
            abxf abxfVar4 = abwwVar.j;
            String str2 = (abxfVar4 == null ? abxf.a : abxfVar4).e;
            if ((abwwVar.b & 8192) != 0) {
                int iAp = a.ap(abwwVar.n);
                i = (iAp == 0 ? 1 : iAp) - 1;
            } else {
                i = 0;
            }
            super(str, lmFileFromWordSpec, wlFileFromWordSpec, str2, i);
            OnDeviceSpecUtils.setSettingsFromSpec(abwwVar, this);
            if (this.recognizerFile == null) {
                Log.e(WordRecognizerJNIWithProto.TAG, "Spec doesn't have a file.");
            }
        }
    }

    public WordRecognizerJNIWithProto(WordRecognizerJNIWithProtoSettings wordRecognizerJNIWithProtoSettings, Context context) throws IOException {
        super(wordRecognizerJNIWithProtoSettings, context);
        if (this.storage != 0) {
            return;
        }
        Log.e(TAG, "Couldn't initialize recognizer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getLmFileFromWordSpec(abxf abxfVar) {
        for (int i = 0; i < abxfVar.d.size(); i++) {
            if (((abxd) abxfVar.d.get(i)).d.equals("hwr_prodlm")) {
                return ((abxd) abxfVar.d.get(i)).c;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getWlFileFromWordSpec(abxf abxfVar) {
        for (int i = 0; i < abxfVar.d.size(); i++) {
            if (((abxd) abxfVar.d.get(i)).d.equals("wordlist")) {
                return ((abxd) abxfVar.d.get(i)).c;
            }
        }
        return null;
    }

    public WordRecognizerJNIWithProto(abww abwwVar, Context context) throws IOException {
        super(new WordRecognizerJNIWithProtoSettings(abwwVar), context);
    }
}
