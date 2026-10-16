package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static androidx.media.AudioAttributesImplApi26 read(defpackage.fic ficVar) {
        androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26 = new androidx.media.AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (android.media.AudioAttributes) ficVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = ficVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26, defpackage.fic ficVar) {
        ficVar.i(audioAttributesImplApi26.a, 1);
        ficVar.h(audioAttributesImplApi26.b, 2);
    }
}
