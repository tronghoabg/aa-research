package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static androidx.media.AudioAttributesImplApi21 read(defpackage.fic ficVar) {
        androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21 = new androidx.media.AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (android.media.AudioAttributes) ficVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = ficVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21, defpackage.fic ficVar) {
        ficVar.i(audioAttributesImplApi21.a, 1);
        ficVar.h(audioAttributesImplApi21.b, 2);
    }
}
