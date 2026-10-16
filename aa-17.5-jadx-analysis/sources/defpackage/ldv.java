package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
final class ldv extends thg {
    final /* synthetic */ lbk a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ Context c;

    public ldv(lbk lbkVar, byte[] bArr, Context context) {
        this.a = lbkVar;
        this.b = bArr;
        this.c = context;
    }

    @Override // defpackage.thg
    public final List a() throws IOException {
        xxh xxhVarG;
        ArrayList arrayList = new ArrayList();
        Uri uri = this.a.l;
        if (uri == null) {
            byte[] bArr = this.b;
            if (bArr != null) {
                ldw.c(arrayList, bArr);
            }
            ((ype) ldw.a.l().ai((char) 3785)).u("No bugreport URI provided");
            return arrayList;
        }
        Context context = this.c;
        ldw.d(context, yzy.Fw);
        xxh xxhVarA = ldw.a(context, uri);
        if (!xxhVarA.f()) {
            byte[] bArr2 = this.b;
            if (bArr2 != null) {
                ldw.c(arrayList, bArr2);
                ldw.d(context, yzy.FA);
                return arrayList;
            }
            ((ype) ((ype) ldw.a.h()).ai((char) 3784)).u("Did not find logs");
            ldw.d(context, yzy.Fz);
            return arrayList;
        }
        Object objB = xxhVarA.b();
        int length = ((byte[]) objB).length;
        int i = 0;
        if (length <= ((int) acqp.b())) {
            ldw.d(this.c, yzy.Fx);
            ldw.b(arrayList, (byte[]) xxhVarA.b(), false);
            return arrayList;
        }
        yph yphVar = ldw.a;
        ((ype) ((ype) yphVar.h()).ai(3778)).K("Bugreport %s of %d bytes is too large to send to Feedback", uri, length);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || !lastPathSegment.endsWith(".zip")) {
            ((ype) ((ype) ldw.a.h()).ai((char) 3779)).y("Bugreport %s is not a ZIP file, so we can't extract anything from it", uri);
            ldw.d(this.c, yzy.Fz);
            return arrayList;
        }
        ((ype) yphVar.l().ai((char) 3794)).y("Looking for the dumpstate txt file in original bugreport ZIP file %s", lastPathSegment);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) objB);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
                String str = null;
                byte[] bArr3 = null;
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            if (name.contains("..")) {
                                for (File file = new File(name); file != null; file = file.getParentFile()) {
                                    if (file.getName().equals("..")) {
                                        throw new ZipException("Illegal name: ".concat(String.valueOf(name)));
                                    }
                                }
                            }
                            if (name.endsWith(".txt") && name.indexOf(47) == -1) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                                    try {
                                        zipOutputStream.putNextEntry(new ZipEntry(name));
                                        yts.a(zipInputStream, zipOutputStream);
                                        zipOutputStream.closeEntry();
                                        zipOutputStream.finish();
                                        byteArrayOutputStream.flush();
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        int length2 = byteArray.length;
                                        int i2 = length2 > i ? length2 : i;
                                        if (length2 > i) {
                                            str = name;
                                        }
                                        if (length2 > i) {
                                            bArr3 = byteArray;
                                        }
                                        zipOutputStream.close();
                                        byteArrayOutputStream.close();
                                        i = i2;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        } else {
                            if (str == null) {
                                ((ype) ((ype) ldw.a.h()).ai((char) 3789)).u("Couldn't find the dumpstate file to extract from bugreport ZIP file");
                                xxhVarG = xvy.a;
                            } else {
                                ((ype) ((ype) ldw.a.f()).ai((char) 3788)).y("Determined %s is the dumpstate file in bugreport ZIP file", str);
                                xxhVarG = xxh.g(bArr3);
                            }
                            zipInputStream.close();
                            byteArrayInputStream.close();
                        }
                    } finally {
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            ((ype) ((ype) ((ype) ldw.a.g()).p(e)).ai((char) 3795)).y("Couldn't read bugreport ZIP file %s from disk", lastPathSegment);
            xxhVarG = xvy.a;
            if (!xxhVarG.f()) {
                ((ype) ((ype) ldw.a.h()).ai((char) 3783)).u("Could not create minimal bugreport");
                ldw.d(this.c, yzy.Fz);
                return arrayList;
            }
            yph yphVar2 = ldw.a;
            ((ype) yphVar2.l().ai(3780)).w("Minimal bugreport is %d bytes", ((byte[]) xxhVarG.b()).length);
            if (((byte[]) xxhVarG.b()).length > ((int) acqp.b())) {
                ((ype) ((ype) yphVar2.h()).ai(3781)).w("Minimal bugreport of %d bytes is still too large to send to Feedback", ((byte[]) xxhVarG.b()).length);
                byte[] bArr4 = this.b;
                if (bArr4 == null) {
                    ((ype) ((ype) yphVar2.h()).ai((char) 3782)).u("Did not find logs");
                    ldw.d(this.c, yzy.Fz);
                    return arrayList;
                }
                ldw.c(arrayList, bArr4);
                ldw.d(this.c, yzy.FA);
            } else {
                ldw.d(this.c, yzy.Fy);
                ldw.b(arrayList, (byte[]) xxhVarG.b(), true);
            }
            return arrayList;
        }
    }

    @Override // defpackage.thg
    public final List b() {
        yph yphVar = ldw.a;
        ArrayList arrayList = new ArrayList();
        lbk lbkVar = this.a;
        arrayList.add(new Pair("app_version_details", lbkVar.m));
        arrayList.add(new Pair("created_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(lbkVar.d)));
        arrayList.add(new Pair("application_mode", lbkVar.c));
        arrayList.add(new Pair("facet", lbkVar.e));
        arrayList.add(new Pair("mendel_flags", yrm.K(lbkVar.b)));
        arrayList.add(new Pair("is_googler", String.valueOf(lbkVar.o)));
        arrayList.add(new Pair("hu_bugreport", String.valueOf(lbkVar.l != null)));
        lbkVar.e();
        arrayList.add(new Pair("debug_log", lbkVar.e()));
        yfy yfyVar = lbkVar.n;
        if (yfyVar != null) {
            yno it = yfyVar.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new Pair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        Boolean bool = lbkVar.g;
        if (bool != null) {
            arrayList.add(new Pair("Assistant Auto TNG", true != bool.booleanValue() ? "false" : "true"));
        }
        return arrayList;
    }
}
