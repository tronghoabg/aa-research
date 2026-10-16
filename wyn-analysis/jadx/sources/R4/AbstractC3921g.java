package r4;

import com.arthenica.ffmpegkit.AbiDetect;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: r4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3921g {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f44351a;

    static {
        ArrayList arrayList = new ArrayList();
        f44351a = arrayList;
        arrayList.add("dav1d");
        arrayList.add("fontconfig");
        arrayList.add("freetype");
        arrayList.add("fribidi");
        arrayList.add("gmp");
        arrayList.add("gnutls");
        arrayList.add("kvazaar");
        arrayList.add("mp3lame");
        arrayList.add("libass");
        arrayList.add("iconv");
        arrayList.add("libilbc");
        arrayList.add("libtheora");
        arrayList.add("libvidstab");
        arrayList.add("libvorbis");
        arrayList.add("libvpx");
        arrayList.add("libwebp");
        arrayList.add("libxml2");
        arrayList.add("opencore-amr");
        arrayList.add("openh264");
        arrayList.add("openssl");
        arrayList.add("opus");
        arrayList.add("rubberband");
        arrayList.add("sdl2");
        arrayList.add("shine");
        arrayList.add("snappy");
        arrayList.add("soxr");
        arrayList.add("speex");
        arrayList.add("srt");
        arrayList.add("tesseract");
        arrayList.add("twolame");
        arrayList.add("x264");
        arrayList.add("x265");
        arrayList.add("xvid");
        arrayList.add("zimg");
    }

    public static ArrayList a() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        Iterator it = f44351a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String b() {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayListA = a();
        boolean zContains = arrayListA.contains("speex");
        boolean zContains2 = arrayListA.contains("fribidi");
        boolean zContains3 = arrayListA.contains("gnutls");
        boolean zContains4 = arrayListA.contains("xvid");
        boolean z14 = true;
        boolean z15 = false;
        if (!zContains || !zContains2) {
            if (zContains) {
                z10 = true;
                z2 = false;
                z12 = false;
            } else {
                if (zContains2) {
                    z2 = true;
                    z10 = false;
                } else if (zContains4) {
                    if (zContains3) {
                        z12 = true;
                        z2 = false;
                        z10 = false;
                        z11 = false;
                        z14 = z11;
                        z13 = z14;
                    } else {
                        z13 = true;
                        z2 = false;
                        z10 = false;
                        z12 = false;
                        z11 = false;
                        z14 = false;
                    }
                } else if (zContains3) {
                    z11 = true;
                    z2 = false;
                    z10 = false;
                    z12 = false;
                    z14 = false;
                    z13 = z14;
                } else {
                    z2 = false;
                    z10 = false;
                }
                z12 = z10;
            }
            z11 = z12;
            z14 = z11;
            z13 = z14;
        } else if (zContains4) {
            z2 = false;
            z10 = false;
            z12 = false;
            z11 = false;
            z13 = false;
        } else {
            z2 = false;
            z10 = false;
            z12 = false;
            z11 = false;
            z13 = false;
            z15 = true;
            z14 = false;
        }
        return z14 ? (arrayListA.contains("dav1d") && arrayListA.contains("fontconfig") && arrayListA.contains("freetype") && arrayListA.contains("fribidi") && arrayListA.contains("gmp") && arrayListA.contains("gnutls") && arrayListA.contains("kvazaar") && arrayListA.contains("mp3lame") && arrayListA.contains("libass") && arrayListA.contains("iconv") && arrayListA.contains("libilbc") && arrayListA.contains("libtheora") && arrayListA.contains("libvidstab") && arrayListA.contains("libvorbis") && arrayListA.contains("libvpx") && arrayListA.contains("libwebp") && arrayListA.contains("libxml2") && arrayListA.contains("opencore-amr") && arrayListA.contains("opus") && arrayListA.contains("shine") && arrayListA.contains("snappy") && arrayListA.contains("soxr") && arrayListA.contains("speex") && arrayListA.contains("twolame") && arrayListA.contains("x264") && arrayListA.contains("x265") && arrayListA.contains("xvid") && arrayListA.contains("zimg")) ? "full-gpl" : "custom" : z15 ? (arrayListA.contains("dav1d") && arrayListA.contains("fontconfig") && arrayListA.contains("freetype") && arrayListA.contains("fribidi") && arrayListA.contains("gmp") && arrayListA.contains("gnutls") && arrayListA.contains("kvazaar") && arrayListA.contains("mp3lame") && arrayListA.contains("libass") && arrayListA.contains("iconv") && arrayListA.contains("libilbc") && arrayListA.contains("libtheora") && arrayListA.contains("libvorbis") && arrayListA.contains("libvpx") && arrayListA.contains("libwebp") && arrayListA.contains("libxml2") && arrayListA.contains("opencore-amr") && arrayListA.contains("opus") && arrayListA.contains("shine") && arrayListA.contains("snappy") && arrayListA.contains("soxr") && arrayListA.contains("speex") && arrayListA.contains("twolame") && arrayListA.contains("zimg")) ? "full" : "custom" : z2 ? (arrayListA.contains("dav1d") && arrayListA.contains("fontconfig") && arrayListA.contains("freetype") && arrayListA.contains("fribidi") && arrayListA.contains("kvazaar") && arrayListA.contains("libass") && arrayListA.contains("iconv") && arrayListA.contains("libtheora") && arrayListA.contains("libvpx") && arrayListA.contains("libwebp") && arrayListA.contains("snappy") && arrayListA.contains("zimg")) ? MimeTypes.BASE_TYPE_VIDEO : "custom" : z10 ? (arrayListA.contains("mp3lame") && arrayListA.contains("libilbc") && arrayListA.contains("libvorbis") && arrayListA.contains("opencore-amr") && arrayListA.contains("opus") && arrayListA.contains("shine") && arrayListA.contains("soxr") && arrayListA.contains("speex") && arrayListA.contains("twolame")) ? MimeTypes.BASE_TYPE_AUDIO : "custom" : z12 ? (arrayListA.contains("gmp") && arrayListA.contains("gnutls") && arrayListA.contains("libvidstab") && arrayListA.contains("x264") && arrayListA.contains("x265") && arrayListA.contains("xvid")) ? "https-gpl" : "custom" : z11 ? (arrayListA.contains("gmp") && arrayListA.contains("gnutls")) ? HttpRequest.DEFAULT_SCHEME : "custom" : z13 ? (arrayListA.contains("libvidstab") && arrayListA.contains("x264") && arrayListA.contains("x265") && arrayListA.contains("xvid")) ? "min-gpl" : "custom" : arrayListA.size() == 0 ? "min" : "custom";
    }
}
