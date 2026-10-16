package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class lbk implements lbn {
    public static final yph a = yph.c("GH.FeedbackBundle");
    public final yfy b;
    public String c;
    public final Date d;
    public String e;
    public String f;
    public Boolean g;
    public Uri h;
    public File i;
    public File j;
    public transient File k;
    public Uri l;
    public String m;
    public yfy n;
    public Boolean o;
    private final StringBuilder p = new StringBuilder();

    public lbk(yfy yfyVar, Date date) {
        this.b = yfyVar;
        date.getClass();
        this.d = date;
    }

    public static lbk b(File file) throws IOException {
        lbp lbpVar = (lbp) abnv.z(lbp.a, new FileInputStream(file), abnj.a());
        aboh<lbq> abohVar = lbpVar.k;
        yfu yfuVar = new yfu(4);
        for (lbq lbqVar : abohVar) {
            yfuVar.e(lbqVar.c, lbqVar.d);
        }
        lbk lbkVar = new lbk(yfuVar.d(true), new Date(lbpVar.e));
        int i = lbpVar.b;
        if ((i & 64) != 0) {
            lbkVar.c = lbpVar.i;
        }
        if ((i & 128) != 0) {
            lbkVar.e = lbpVar.j;
        }
        if ((i & 1) != 0) {
            lbkVar.f = lbpVar.c;
        }
        if ((i & 4096) != 0) {
            lbkVar.h = Uri.parse(lbpVar.p);
        }
        if ((lbpVar.b & 2) != 0) {
            lbkVar.i = new File(lbpVar.d);
        }
        if ((lbpVar.b & 8) != 0) {
            lbkVar.j = new File(lbpVar.f);
        }
        if ((lbpVar.b & 2048) != 0) {
            lbkVar.l = Uri.parse(lbpVar.o);
        }
        if ((lbpVar.b & 16) != 0) {
            lbkVar.p.append(lbpVar.g);
        }
        if ((lbpVar.b & 32) != 0) {
            lbkVar.m = lbpVar.h;
        }
        if (acyt.c() && lbpVar.l.size() > 0) {
            aboh<lbr> abohVar2 = lbpVar.l;
            yfu yfuVar2 = new yfu(4);
            for (lbr lbrVar : abohVar2) {
                yfuVar2.e(lbrVar.c, lbrVar.d);
            }
            lbkVar.n = yfuVar2.d(true);
        }
        if ((lbpVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            lbkVar.o = Boolean.valueOf(lbpVar.m);
        }
        if ((lbpVar.b & 1024) != 0) {
            lbkVar.g = Boolean.valueOf(lbpVar.n);
        }
        lbkVar.k = file;
        return lbkVar;
    }

    public static File c(Context context) {
        File file = new File(context.getFilesDir(), CloudRecognizerProtocolStrings.FEEDBACK);
        file.mkdirs();
        return file;
    }

    @ResultIgnorabilityUnspecified
    private static void j(File file) {
        if (file != null) {
            file.delete();
        }
    }

    @Override // defpackage.lbn
    public final void a(String... strArr) {
        String str = DateFormat.getTimeInstance().format(new Date());
        StringBuilder sb = this.p;
        sb.append(str);
        sb.append(": ");
        for (String str2 : strArr) {
            sb.append(str2);
        }
        sb.append("\n");
    }

    public final FileOutputStream d(Context context) throws IOException {
        g(context);
        File file = new File(this.k.getParentFile(), String.valueOf(this.k.getName()).concat(".logs"));
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        this.i = file;
        return fileOutputStream;
    }

    public final String e() {
        return this.p.toString();
    }

    public final void f(Context context) {
        j(this.i);
        Uri uri = this.h;
        if (uri == null || !"file".equals(uri.getScheme())) {
            Uri uri2 = this.h;
            if (uri2 != null) {
                context.getContentResolver().delete(uri2, null, null);
            }
        } else {
            Uri uri3 = this.h;
            uri3.getClass();
            if (!affa.f(uri3.getScheme(), "file")) {
                Objects.toString(uri3);
                throw new IllegalArgumentException("Uri lacks 'file' scheme: ".concat(uri3.toString()));
            }
            String path = uri3.getPath();
            if (path == null) {
                Objects.toString(uri3);
                throw new IllegalArgumentException("Uri path is null: ".concat(uri3.toString()));
            }
            j(new File(path));
        }
        j(this.k);
        j(this.j);
        this.i = null;
        this.h = null;
        this.k = null;
        this.j = null;
        this.n = null;
    }

    public final void g(Context context) throws IOException {
        if (this.k != null) {
            return;
        }
        File fileC = c(context);
        if (!fileC.isDirectory()) {
            throw new IOException("Couldn't create directory ".concat(fileC.toString()));
        }
        this.k = File.createTempFile(this.d.getTime() + "." + String.valueOf(UUID.randomUUID()) + ".", ".feedbackbundle", fileC);
    }

    public final void h(Context context) throws IOException {
        g(context);
        abnp abnpVarN = lbp.a.n();
        yfy yfyVar = this.b;
        ArrayList arrayList = new ArrayList(((ylx) yfyVar).d);
        yno it = yfyVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abnp abnpVarN2 = lbq.a.n();
            String str = (String) entry.getKey();
            abnpVarN2.t();
            lbq lbqVar = (lbq) abnpVarN2.b;
            str.getClass();
            lbqVar.b |= 1;
            lbqVar.c = str;
            String str2 = (String) entry.getValue();
            abnpVarN2.t();
            lbq lbqVar2 = (lbq) abnpVarN2.b;
            str2.getClass();
            lbqVar2.b |= 2;
            lbqVar2.d = str2;
            arrayList.add((lbq) abnpVarN2.q());
        }
        abnpVarN.t();
        lbp lbpVar = (lbp) abnpVarN.b;
        aboh abohVar = lbpVar.k;
        if (!abohVar.c()) {
            lbpVar.k = abnv.I(abohVar);
        }
        abmc.i(arrayList, lbpVar.k);
        String str3 = this.c;
        if (str3 != null) {
            abnpVarN.t();
            lbp lbpVar2 = (lbp) abnpVarN.b;
            lbpVar2.b |= 64;
            lbpVar2.i = str3;
        }
        String str4 = this.e;
        if (str4 != null) {
            abnpVarN.t();
            lbp lbpVar3 = (lbp) abnpVarN.b;
            lbpVar3.b |= 128;
            lbpVar3.j = str4;
        }
        String str5 = this.f;
        if (str5 != null) {
            abnpVarN.t();
            lbp lbpVar4 = (lbp) abnpVarN.b;
            lbpVar4.b |= 1;
            lbpVar4.c = str5;
        }
        Uri uri = this.h;
        if (uri != null) {
            String string = uri.toString();
            abnpVarN.t();
            lbp lbpVar5 = (lbp) abnpVarN.b;
            string.getClass();
            lbpVar5.b |= 4096;
            lbpVar5.p = string;
        }
        File file = this.i;
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            abnpVarN.t();
            lbp lbpVar6 = (lbp) abnpVarN.b;
            absolutePath.getClass();
            lbpVar6.b |= 2;
            lbpVar6.d = absolutePath;
        }
        long time = this.d.getTime();
        abnpVarN.t();
        lbp lbpVar7 = (lbp) abnpVarN.b;
        lbpVar7.b |= 4;
        lbpVar7.e = time;
        File file2 = this.j;
        if (file2 != null) {
            String absolutePath2 = file2.getAbsolutePath();
            abnpVarN.t();
            lbp lbpVar8 = (lbp) abnpVarN.b;
            absolutePath2.getClass();
            lbpVar8.b |= 8;
            lbpVar8.f = absolutePath2;
        }
        Uri uri2 = this.l;
        if (uri2 != null) {
            String string2 = uri2.toString();
            abnpVarN.t();
            lbp lbpVar9 = (lbp) abnpVarN.b;
            string2.getClass();
            lbpVar9.b |= 2048;
            lbpVar9.o = string2;
        }
        String string3 = this.p.toString();
        abnpVarN.t();
        lbp lbpVar10 = (lbp) abnpVarN.b;
        lbpVar10.b |= 16;
        lbpVar10.g = string3;
        String str6 = this.m;
        if (str6 != null) {
            abnpVarN.t();
            lbp lbpVar11 = (lbp) abnpVarN.b;
            lbpVar11.b |= 32;
            lbpVar11.h = str6;
        }
        yfy yfyVar2 = this.n;
        if (yfyVar2 != null) {
            ArrayList arrayList2 = new ArrayList(yfyVar2.size());
            yno it2 = yfyVar2.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                abnp abnpVarN3 = lbr.a.n();
                String str7 = (String) entry2.getKey();
                abnpVarN3.t();
                lbr lbrVar = (lbr) abnpVarN3.b;
                str7.getClass();
                lbrVar.b |= 1;
                lbrVar.c = str7;
                String str8 = (String) entry2.getValue();
                abnpVarN3.t();
                lbr lbrVar2 = (lbr) abnpVarN3.b;
                str8.getClass();
                lbrVar2.b |= 2;
                lbrVar2.d = str8;
                arrayList2.add((lbr) abnpVarN3.q());
            }
            abnpVarN.t();
            lbp lbpVar12 = (lbp) abnpVarN.b;
            aboh abohVar2 = lbpVar12.l;
            if (!abohVar2.c()) {
                lbpVar12.l = abnv.I(abohVar2);
            }
            abmc.i(arrayList2, lbpVar12.l);
        }
        Boolean bool = this.o;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            abnpVarN.t();
            lbp lbpVar13 = (lbp) abnpVarN.b;
            lbpVar13.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            lbpVar13.m = zBooleanValue;
        }
        Boolean bool2 = this.g;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            abnpVarN.t();
            lbp lbpVar14 = (lbp) abnpVarN.b;
            lbpVar14.b |= 1024;
            lbpVar14.n = zBooleanValue2;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.k);
        try {
            ((lbp) abnpVarN.q()).g(fileOutputStream);
            fileOutputStream.close();
            if (this.k.getPath().endsWith(".feedbackbundle")) {
                File file3 = new File(this.k.getParentFile(), String.valueOf(this.k.getName()).concat(".ready"));
                if (this.k.renameTo(file3)) {
                    this.k = file3;
                } else {
                    ((ype) ((ype) a.g()).ai(3734)).M("Failed to rename from %s to %s", this.k.getName(), file3.getName());
                }
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(boolean z) {
        this.o = Boolean.valueOf(z);
    }
}
