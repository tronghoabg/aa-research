package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static androidx.media.AudioAttributesImplBase read(defpackage.fic ficVar) {
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = new androidx.media.AudioAttributesImplBase();
        audioAttributesImplBase.a = ficVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = ficVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = ficVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = ficVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(androidx.media.AudioAttributesImplBase audioAttributesImplBase, defpackage.fic ficVar) {
        ficVar.h(audioAttributesImplBase.a, 1);
        ficVar.h(audioAttributesImplBase.b, 2);
        ficVar.h(audioAttributesImplBase.c, 3);
        ficVar.h(audioAttributesImplBase.d, 4);
    }
}
