package com.waze.t;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import h.g.b.x;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements com.waze.t.b.b {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40879a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f40880b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40881c;

    /* renamed from: d, reason: collision with root package name */
    private final a f40882d;

    /* renamed from: e, reason: collision with root package name */
    private final ab f40883e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40884f;

    /* renamed from: g, reason: collision with root package name */
    private final af f40885g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40886h;

    /* renamed from: i, reason: collision with root package name */
    private int f40887i;

    /* renamed from: j, reason: collision with root package name */
    private String f40888j;

    /* renamed from: k, reason: collision with root package name */
    private final DateTimeFormatter f40889k;

    /* renamed from: l, reason: collision with root package name */
    private ByteArrayOutputStream f40890l;

    public g(Application application, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.i.e eVar2, a aVar, ab abVar) {
        x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        x.f(eVar, "clock");
        x.f(eVar2, "logger");
        x.f(aVar, "config");
        x.f(abVar, "dispatcher");
        x.f("conversation_logs/", "logFolderPathRelative");
        this.f40879a = application;
        this.f40880b = eVar;
        this.f40881c = eVar2;
        this.f40882d = aVar;
        this.f40883e = abVar;
        this.f40884f = "conversation_logs/";
        this.f40885g = aj.e(abVar);
        this.f40886h = String.valueOf(com.waze.settings.h.c.f(eVar.a()));
        this.f40889k = DateTimeFormatter.ofPattern("yyyy-MM-dd:HH-mm-ss").withZone(ZoneId.systemDefault());
        this.f40890l = new ByteArrayOutputStream();
    }

    public static final /* synthetic */ String e(g gVar, String str, String str2) {
        String str3 = gVar.f40889k.format(gVar.f40880b.b());
        StringBuilder sb = new StringBuilder(CmcdData.STREAMING_FORMAT_SS);
        sb.append(gVar.f40886h);
        sb.append(".c");
        sb.append(gVar.f40887i);
        sb.append(".");
        sb.append(str3);
        sb.append(".");
        sb.append(str2);
        sb.append(".");
        if (str != null) {
            sb.append(str);
            sb.append(".");
        }
        sb.append("ogg");
        return sb.toString();
    }

    public static final /* synthetic */ void h(g gVar) {
        File[] fileArrListFiles;
        List listX;
        List listAl;
        Object objA;
        Object objA2;
        File fileR = gVar.r();
        if (fileR == null || (fileArrListFiles = fileR.listFiles()) == null || (listX = h.a.c.X(fileArrListFiles)) == null || (listAl = h.a.i.al(h.a.i.ac(listX), new com.google.firebase.crashlytics.a.c.h(14))) == null) {
            return;
        }
        List listAq = h.a.i.aq(listAl);
        long jA = gVar.f40880b.a() - h.o.a.m(gVar.f40882d.b());
        List list = listAq;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((File) obj).lastModified() >= jA) {
                break;
            } else {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        listAq.removeAll(arrayList2);
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                objA2 = Boolean.valueOf(((File) it.next()).delete());
            } catch (Throwable th) {
                objA2 = e.b.c.a(th);
            }
            if (h.m.e(objA2)) {
                ((Boolean) objA2).booleanValue();
                i2++;
            }
            Throwable thC = h.m.c(objA2);
            if (thC != null) {
                gVar.f40881c.c("Failed to delete file", thC);
            }
        }
        Iterator it2 = list.iterator();
        long length = 0;
        while (it2.hasNext()) {
            length += ((File) it2.next()).length();
        }
        Iterator it3 = listAq.iterator();
        while (it3.hasNext() && length > gVar.f40882d.a()) {
            File file = (File) it3.next();
            long length2 = file.length();
            try {
                if (file.delete()) {
                    i2++;
                    length -= length2;
                }
                objA = h.ab.f48028a;
            } catch (Throwable th2) {
                objA = e.b.c.a(th2);
            }
            Throwable thC2 = h.m.c(objA);
            if (thC2 != null) {
                gVar.f40881c.c("Failed to delete file", thC2);
            }
        }
        if (i2 > 0) {
            gVar.f40881c.e("deleted " + i2 + " old files from " + fileR.getPath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File r() {
        File file = new File(this.f40879a.getFilesDir(), this.f40884f);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        this.f40881c.b("Failed to create log folder");
        return null;
    }

    @Override // com.waze.t.b.b
    public final void l(byte[] bArr) {
        x.f(bArr, "audioChunk");
        if (this.f40882d.c()) {
            aj.z(this.f40885g, null, null, new e(this, bArr, (h.c.e) null, 1), 3);
        }
    }

    @Override // com.waze.t.b.b
    public final void m() {
        if (this.f40882d.c()) {
            aj.z(this.f40885g, null, null, new c(this, null), 3);
        }
    }

    @Override // com.waze.t.b.b
    public final void n() {
        if (this.f40882d.c()) {
            aj.z(this.f40885g, null, null, new d(this, null, 1, null), 3);
        }
    }

    @Override // com.waze.t.b.b
    public final void o() {
        if (this.f40882d.c()) {
            aj.z(this.f40885g, null, null, new d(this, null, 0), 3);
        }
    }

    @Override // com.waze.t.b.b
    public final void p(String str) {
        x.f(str, "conversationId");
        if (this.f40882d.c() && !x.n(this.f40888j, str)) {
            aj.z(this.f40885g, null, null, new e(this, str, (h.c.e) null, 0), 3);
        }
    }

    @Override // com.waze.t.b.b
    public final void q(byte[] bArr) {
        x.f(bArr, "fullAudioContent");
        if (this.f40882d.c()) {
            aj.z(this.f40885g, null, null, new f(this, bArr, null), 3);
        }
    }
}
