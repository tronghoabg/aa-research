package com.bytedance.adsdk.oa;

import N0.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.oa.lw.gzw;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class bcc {
    private static final Map<String, cq<xs>> uef = new HashMap();

    /* renamed from: oa, reason: collision with root package name */
    private static final Set<Object> f24525oa = new HashSet();
    private static final byte[] yo = {80, 75, 3, 4};

    public static cq<xs> oa(Context context, String str) {
        return oa(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static wrv<xs> yo(Context context, String str) {
        return yo(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static cq<xs> oa(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return uef(str2, new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.bcc.4
            @Override // java.util.concurrent.Callable
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public wrv<xs> call() throws Exception {
                return bcc.yo(applicationContext, str, str2);
            }
        });
    }

    public static cq<xs> uef(Context context, String str) {
        return uef(context, str, "url_".concat(String.valueOf(str)));
    }

    public static wrv<xs> yo(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return oa(context.getAssets().open(str), str2);
            }
            return uef(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e7) {
            return new wrv<>((Throwable) e7);
        }
    }

    public static cq<xs> uef(final Context context, final String str, final String str2) {
        return uef(str2, new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.bcc.1
            @Override // java.util.concurrent.Callable
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public wrv<xs> call() throws Exception {
                wrv<xs> wrvVarUef = lw.uef(context).uef(context, str, str2);
                if (str2 != null && wrvVarUef.uef() != null) {
                    com.bytedance.adsdk.oa.yo.lw.uef().uef(str2, wrvVarUef.uef());
                }
                return wrvVarUef;
            }
        });
    }

    public static wrv<xs> oa(Context context, int i5) {
        return oa(context, i5, yo(context, i5));
    }

    public static cq<xs> uef(Context context, int i5) {
        return uef(context, i5, yo(context, i5));
    }

    public static wrv<xs> oa(Context context, int i5, String str) {
        try {
            return oa(context.getResources().openRawResource(i5), yo(context, i5));
        } catch (Resources.NotFoundException e7) {
            return new wrv<>((Throwable) e7);
        }
    }

    public static cq<xs> uef(Context context, final int i5, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return uef(str, new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.bcc.5
            @Override // java.util.concurrent.Callable
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public wrv<xs> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return bcc.oa(context2, i5, str);
            }
        });
    }

    private static String yo(Context context, int i5) {
        return a.d(i5, uef(context) ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static wrv<xs> oa(InputStream inputStream, String str) {
        return uef(inputStream, str, true);
    }

    private static wrv<xs> oa(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            xs xsVarUef = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    xsVarUef = uef(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).uef();
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i5 = zipInputStream.read(bArr);
                                    if (i5 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i5);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (xsVarUef == null) {
                return new wrv<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                zjm zjmVarUef = uef(xsVarUef, (String) entry.getKey());
                if (zjmVarUef != null) {
                    zjmVarUef.uef(com.bytedance.adsdk.oa.ivm.ivm.uef((Bitmap) entry.getValue(), zjmVarUef.uef(), zjmVarUef.oa()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z2 = false;
                for (com.bytedance.adsdk.oa.yo.yo yoVar : xsVarUef.wk().values()) {
                    if (yoVar.uef().equals(entry2.getKey())) {
                        yoVar.uef((Typeface) entry2.getValue());
                        z2 = true;
                    }
                }
                if (!z2) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, zjm>> it = xsVarUef.ab().entrySet().iterator();
                while (it.hasNext()) {
                    zjm value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strCz = value.cz();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strCz.startsWith("data:") && strCz.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strCz.substring(strCz.indexOf(44) + 1), 0);
                            value.uef(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, zjm> entry3 : xsVarUef.ab().entrySet()) {
                if (entry3.getValue().dj() == null) {
                    return new wrv<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().cz()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.oa.yo.lw.uef().uef(str, xsVarUef);
            }
            return new wrv<>(xsVarUef);
        } catch (IOException e7) {
            return new wrv<>((Throwable) e7);
        }
    }

    private static boolean uef(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static cq<xs> uef(final InputStream inputStream, final String str) {
        return uef(str, new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.bcc.6
            @Override // java.util.concurrent.Callable
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public wrv<xs> call() throws Exception {
                return bcc.oa(inputStream, str);
            }
        });
    }

    private static wrv<xs> uef(InputStream inputStream, String str, boolean z2) throws IOException {
        try {
            return uef(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z2) {
                com.bytedance.adsdk.oa.ivm.ivm.uef(inputStream);
            }
        }
    }

    public static wrv<xs> uef(JsonReader jsonReader, String str) {
        return uef(jsonReader, str, true);
    }

    private static wrv<xs> uef(JsonReader jsonReader, String str, boolean z2) throws IOException {
        try {
            try {
                xs xsVarUef = gzw.uef(jsonReader);
                com.bytedance.adsdk.oa.yo.lw.uef().uef(str, xsVarUef);
                wrv<xs> wrvVar = new wrv<>(xsVarUef);
                if (z2) {
                    uef(jsonReader);
                }
                return wrvVar;
            } catch (Exception e7) {
                wrv<xs> wrvVar2 = new wrv<>(e7);
                if (z2) {
                    uef(jsonReader);
                }
                return wrvVar2;
            }
        } catch (Throwable th) {
            if (z2) {
                uef(jsonReader);
            }
            throw th;
        }
    }

    public static void uef(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static wrv<xs> uef(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return oa(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.oa.ivm.ivm.uef(zipInputStream);
        }
    }

    private static zjm uef(xs xsVar, String str) {
        for (zjm zjmVar : xsVar.ab().values()) {
            if (zjmVar.cz().equals(str)) {
                return zjmVar;
            }
        }
        return null;
    }

    private static cq<xs> uef(final String str, Callable<wrv<xs>> callable) {
        final xs xsVarUef = str == null ? null : com.bytedance.adsdk.oa.yo.lw.uef().uef(str);
        if (xsVarUef != null) {
            return new cq<>(new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.bcc.7
                @Override // java.util.concurrent.Callable
                /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                public wrv<xs> call() throws Exception {
                    return new wrv<>(xsVarUef);
                }
            });
        }
        if (str != null) {
            Map<String, cq<xs>> map = uef;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        cq<xs> cqVar = new cq<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            cqVar.uef(new dj<xs>() { // from class: com.bytedance.adsdk.oa.bcc.2
                @Override // com.bytedance.adsdk.oa.dj
                public void uef(xs xsVar) {
                    bcc.uef.remove(str);
                    atomicBoolean.set(true);
                    if (bcc.uef.size() == 0) {
                        bcc.oa(true);
                    }
                }
            });
            cqVar.yo(new dj<Throwable>() { // from class: com.bytedance.adsdk.oa.bcc.3
                @Override // com.bytedance.adsdk.oa.dj
                public void uef(Throwable th) {
                    bcc.uef.remove(str);
                    atomicBoolean.set(true);
                    if (bcc.uef.size() == 0) {
                        bcc.oa(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, cq<xs>> map2 = uef;
                map2.put(str, cqVar);
                if (map2.size() == 1) {
                    oa(false);
                }
            }
        }
        return cqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oa(boolean z2) {
        ArrayList arrayList = new ArrayList(f24525oa);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            arrayList.get(i5);
        }
    }
}
