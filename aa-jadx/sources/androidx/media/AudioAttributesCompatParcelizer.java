package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(defpackage.fic ficVar) {
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat();
        audioAttributesCompat.a = (androidx.media.AudioAttributesImpl) ficVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, defpackage.fic ficVar) {
        ficVar.u(audioAttributesCompat.a);
    }
}
