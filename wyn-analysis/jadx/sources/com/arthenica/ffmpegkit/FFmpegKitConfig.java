package com.arthenica.ffmpegkit;

import A.AbstractC0213f;
import R1.i;
import a2.C1325e;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import cb.AbstractC1593a;
import com.moloco.sdk.internal.publisher.H;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.utils.StringUtils;
import pd.f;
import r4.AbstractC3915a;
import r4.C3916b;
import r4.C3917c;
import r4.C3918d;
import r4.C3919e;
import r4.C3920f;
import r4.C3923i;
import r4.InterfaceC3922h;
import s4.a;
import u4.AbstractC4249a;

/* loaded from: classes.dex */
public class FFmpegKitConfig {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f24183a;

    /* renamed from: b, reason: collision with root package name */
    public static int f24184b;

    /* renamed from: c, reason: collision with root package name */
    public static int f24185c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1325e f24186d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedList f24187e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f24188f;

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f24189g;

    /* renamed from: h, reason: collision with root package name */
    public static a f24190h;

    /* renamed from: i, reason: collision with root package name */
    public static a f24191i;

    /* renamed from: j, reason: collision with root package name */
    public static a f24192j;
    public static a k;

    /* renamed from: l, reason: collision with root package name */
    public static a f24193l;

    /* renamed from: m, reason: collision with root package name */
    public static final SparseArray f24194m;

    /* renamed from: n, reason: collision with root package name */
    public static final SparseArray f24195n;

    /* renamed from: o, reason: collision with root package name */
    public static int f24196o;

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    static {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.<clinit>():void");
    }

    public static String a(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (i5 > 0) {
                sb2.append(StringUtils.SPACE);
            }
            sb2.append(strArr[i5]);
        }
        return sb2.toString();
    }

    public static void b() {
        while (true) {
            LinkedList linkedList = f24187e;
            if (linkedList.size() <= f24185c) {
                return;
            }
            try {
                InterfaceC3922h interfaceC3922h = (InterfaceC3922h) linkedList.remove(0);
                if (interfaceC3922h != null) {
                    f24186d.remove(Long.valueOf(((AbstractC3915a) interfaceC3922h).f44329a));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    public static void c() {
        disableNativeRedirection();
    }

    public static void d() {
        enableNativeRedirection();
    }

    private static native void disableNativeRedirection();

    public static void e(C3917c c3917c) {
        c3917c.f44337i = 2;
        c3917c.f44331c = new Date();
        String[] strArr = c3917c.f44333e;
        try {
            c3917c.f44338j = new i(nativeFFmpegExecute(c3917c.f44329a, strArr), 6, (byte) 0);
            c3917c.f44337i = 4;
            c3917c.f44332d = new Date();
        } catch (Exception e7) {
            c3917c.d(e7);
            Log.w("ffmpeg-kit", "FFmpeg execute failed: " + a(strArr) + "." + AbstractC4249a.a(e7));
        }
    }

    private static native void enableNativeRedirection();

    public static void f(C3918d c3918d) {
        c3918d.f44337i = 2;
        c3918d.f44331c = new Date();
        String[] strArr = c3918d.f44333e;
        try {
            c3918d.f44338j = new i(nativeFFprobeExecute(c3918d.f44329a, strArr), 6, (byte) 0);
            c3918d.f44337i = 4;
            c3918d.f44332d = new Date();
        } catch (Exception e7) {
            c3918d.d(e7);
            Log.w("ffmpeg-kit", "FFprobe execute failed: " + a(strArr) + "." + AbstractC4249a.a(e7));
        }
    }

    public static String g() {
        return getNativeBuildDate();
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    public static native int getNativeLogLevel();

    private static native String getNativeVersion();

    public static String h() {
        return getNativeFFmpegVersion();
    }

    public static void i(C3920f c3920f, int i5) {
        c3920f.f44337i = 2;
        c3920f.f44331c = new Date();
        String[] strArr = c3920f.f44333e;
        try {
            int iNativeFFprobeExecute = nativeFFprobeExecute(c3920f.f44329a, strArr);
            c3920f.f44338j = new i(iNativeFFprobeExecute, 6, (byte) 0);
            c3920f.f44337i = 4;
            c3920f.f44332d = new Date();
            if (iNativeFFprobeExecute == 0) {
                LinkedList linkedListE = c3920f.e(i5);
                StringBuilder sb2 = new StringBuilder();
                int size = linkedListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C3919e c3919e = (C3919e) linkedListE.get(i10);
                    if (c3919e.f44348b == 1) {
                        sb2.append(c3919e.f44349c);
                    }
                }
                c3920f.f44350n = H.U(sb2.toString());
            }
        } catch (Exception e7) {
            c3920f.d(e7);
            Log.w("ffmpeg-kit", "Get media information execute failed: " + a(strArr) + "." + AbstractC4249a.a(e7));
        }
    }

    private static native void ignoreNativeSignal(int i5);

    public static InterfaceC3922h j(long j8) {
        InterfaceC3922h interfaceC3922h;
        synchronized (f24188f) {
            interfaceC3922h = (InterfaceC3922h) f24186d.get(Long.valueOf(j8));
        }
        return interfaceC3922h;
    }

    public static void k(int i5) {
        int i10 = 2;
        if (i5 != 1) {
            if (i5 == 2) {
                i10 = 3;
            } else if (i5 == 3) {
                i10 = 13;
            } else if (i5 == 4) {
                i10 = 15;
            } else {
                if (i5 != 5) {
                    throw null;
                }
                i10 = 24;
            }
        }
        ignoreNativeSignal(i10);
    }

    public static String l(Context context) {
        File file = new File(context.getCacheDir(), "pipes");
        if (!file.exists() && !file.mkdirs()) {
            Log.e("ffmpeg-kit", "Failed to create pipes directory: " + file.getAbsolutePath() + ".");
            return null;
        }
        String str = MessageFormat.format("{0}{1}{2}{3}", file, File.separator, "fk_pipe_", Integer.valueOf(f24183a.getAndIncrement()));
        File file2 = new File(str);
        if (file2.exists()) {
            file2.delete();
        }
        int iRegisterNewNativeFFmpegPipe = registerNewNativeFFmpegPipe(str);
        if (iRegisterNewNativeFFmpegPipe == 0) {
            return str;
        }
        Log.e("ffmpeg-kit", String.format("Failed to register new FFmpeg pipe %s. Operation failed with rc=%d.", str, Integer.valueOf(iRegisterNewNativeFFmpegPipe)));
        return null;
    }

    private static void log(long j8, int i5, byte[] bArr) {
        boolean z2;
        int iC = f.c(i5);
        String str = new String(bArr);
        C3919e c3919e = new C3919e(iC, j8, str);
        int i10 = f24196o;
        int i11 = f24184b;
        if ((i11 != 2 || i5 == -16) && i5 <= f.i(i11)) {
            InterfaceC3922h interfaceC3922hJ = j(j8);
            if (interfaceC3922hJ != null) {
                AbstractC3915a abstractC3915a = (AbstractC3915a) interfaceC3922hJ;
                i10 = abstractC3915a.f44339l;
                synchronized (abstractC3915a.f44335g) {
                    abstractC3915a.f44334f.add(c3919e);
                }
            }
            a aVar = f24190h;
            if (aVar != null) {
                try {
                    aVar.a(c3919e);
                } catch (Exception e7) {
                    AbstractC1593a.t("Exception thrown inside global log callback.", AbstractC4249a.a(e7), "ffmpeg-kit");
                }
                z2 = true;
            } else {
                z2 = false;
            }
            int iF = AbstractC0213f.f(i10);
            if (iF != 1) {
                if (iF != 2) {
                    if (iF != 3 && iF == 4) {
                        return;
                    }
                } else if (z2) {
                    return;
                }
            } else if (z2) {
                return;
            }
            switch (AbstractC0213f.f(iC)) {
                case 1:
                    return;
                case 2:
                case 3:
                case 4:
                    Log.e("ffmpeg-kit", str);
                    return;
                case 5:
                    Log.w("ffmpeg-kit", str);
                    return;
                case 6:
                    Log.i("ffmpeg-kit", str);
                    return;
                case 7:
                default:
                    Log.v("ffmpeg-kit", str);
                    return;
                case 8:
                case 9:
                    Log.d("ffmpeg-kit", str);
                    return;
            }
        }
    }

    public static void m(String str, String str2) {
        setNativeEnvironmentVariable(str, str2);
    }

    public static native int messagesInTransmit(long j8);

    public static void n(Context context, List list, Map map) throws IOException {
        int i5;
        Object obj;
        File file = new File(context.getCacheDir(), "fontconfig");
        if (!file.exists()) {
            Log.d("ffmpeg-kit", "Created temporary font conf directory: " + file.mkdirs() + ".");
        }
        File file2 = new File(file, "fonts.conf");
        if (file2.exists()) {
            Log.d("ffmpeg-kit", "Deleted old temporary font configuration: " + file2.delete() + ".");
        }
        StringBuilder sb2 = new StringBuilder("");
        if (map == null || map.size() <= 0) {
            i5 = 0;
        } else {
            map.entrySet();
            i5 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str2 != null && str.trim().length() > 0 && str2.trim().length() > 0) {
                    sb2.append("    <match target=\"pattern\">\n        <test qual=\"any\" name=\"family\">\n");
                    sb2.append("            <string>" + str + "</string>\n");
                    sb2.append("        </test>\n        <edit name=\"family\" mode=\"assign\" binding=\"same\">\n");
                    sb2.append("            <string>" + str2 + "</string>\n");
                    sb2.append("        </edit>\n    </match>\n");
                    i5++;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder("<?xml version=\"1.0\"?>\n<!DOCTYPE fontconfig SYSTEM \"fonts.dtd\">\n<fontconfig>\n    <dir prefix=\"cwd\">.</dir>\n");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            N0.a.r(sb3, "    <dir>", (String) it.next(), "</dir>\n");
        }
        sb3.append((CharSequence) sb2);
        sb3.append("</fontconfig>\n");
        AtomicReference atomicReference = new AtomicReference();
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    atomicReference.set(fileOutputStream);
                    fileOutputStream.write(sb3.toString().getBytes());
                    fileOutputStream.flush();
                    Log.d("ffmpeg-kit", String.format("Saved new temporary font configuration with %d font name mappings.", Integer.valueOf(i5)));
                    o(file.getAbsolutePath());
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Log.d("ffmpeg-kit", "Font directory " + ((String) it2.next()) + " registered successfully.");
                    }
                    if (obj != null) {
                        ((FileOutputStream) atomicReference.get()).close();
                    }
                } catch (IOException e7) {
                    Log.e("ffmpeg-kit", "Failed to set font directory: " + Arrays.toString(list.toArray()) + "." + AbstractC4249a.a(e7));
                    if (atomicReference.get() != null) {
                        ((FileOutputStream) atomicReference.get()).close();
                    }
                }
            } catch (IOException unused) {
            }
        } finally {
            if (atomicReference.get() != null) {
                try {
                    ((FileOutputStream) atomicReference.get()).close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public static native void nativeFFmpegCancel(long j8);

    private static native int nativeFFmpegExecute(long j8, String[] strArr);

    public static native int nativeFFprobeExecute(long j8, String[] strArr);

    public static void o(String str) {
        setNativeEnvironmentVariable("FONTCONFIG_PATH", str);
    }

    public static void p(int i5) {
        if (i5 != 0) {
            f24184b = i5;
            setNativeLogLevel(f.i(i5));
        }
    }

    private static native int registerNewNativeFFmpegPipe(String str);

    private static int safClose(int i5) {
        try {
            SparseArray sparseArray = f24195n;
            C3916b c3916b = (C3916b) sparseArray.get(i5);
            if (c3916b != null) {
                ParcelFileDescriptor parcelFileDescriptor = c3916b.f44344e;
                if (parcelFileDescriptor != null) {
                    sparseArray.delete(i5);
                    f24194m.delete(c3916b.f44340a.intValue());
                    parcelFileDescriptor.close();
                    return 1;
                }
                Log.e("ffmpeg-kit", String.format("ParcelFileDescriptor for SAF fd %d not found.", Integer.valueOf(i5)));
            } else {
                Log.e("ffmpeg-kit", String.format("SAF fd %d not found.", Integer.valueOf(i5)));
            }
        } catch (Throwable th) {
            Log.e("ffmpeg-kit", String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i5), AbstractC4249a.a(th)));
        }
        return 0;
    }

    private static int safOpen(int i5) {
        C3916b c3916b;
        try {
            c3916b = (C3916b) f24194m.get(i5);
        } catch (Throwable th) {
            Log.e("ffmpeg-kit", String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i5), AbstractC4249a.a(th)));
        }
        if (c3916b == null) {
            Log.e("ffmpeg-kit", String.format("SAF id %d not found.", Integer.valueOf(i5)));
            return 0;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c3916b.f44343d.openFileDescriptor(c3916b.f44341b, c3916b.f44342c);
        c3916b.f44344e = parcelFileDescriptorOpenFileDescriptor;
        int fd2 = parcelFileDescriptorOpenFileDescriptor.getFd();
        f24195n.put(fd2, c3916b);
        return fd2;
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i5);

    private static void statistics(long j8, int i5, float f10, float f11, long j10, double d3, double d5, double d10) {
        C3923i c3923i = new C3923i();
        c3923i.f44352a = j8;
        c3923i.f44353b = i5;
        c3923i.f44354c = f10;
        c3923i.f44355d = f11;
        c3923i.f44356e = j10;
        c3923i.f44357f = d3;
        c3923i.f44358g = d5;
        c3923i.f44359h = d10;
        InterfaceC3922h interfaceC3922hJ = j(j8);
        if (interfaceC3922hJ != null && interfaceC3922hJ.a()) {
            C3917c c3917c = (C3917c) interfaceC3922hJ;
            synchronized (c3917c.f44346o) {
                c3917c.f44345n.add(c3923i);
            }
        }
        a aVar = f24191i;
        if (aVar != null) {
            try {
                aVar.b(c3923i);
            } catch (Exception e7) {
                AbstractC1593a.t("Exception thrown inside global statistics callback.", AbstractC4249a.a(e7), "ffmpeg-kit");
            }
        }
    }
}
