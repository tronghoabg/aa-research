package X8;

import A0.f;
import A7.AbstractC0279p0;
import K3.r;
import R1.i;
import R8.h;
import R8.j;
import U8.L0;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import com.qonversion.android.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f16174e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f16175f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final V8.a f16176g = new V8.a();

    /* renamed from: h, reason: collision with root package name */
    public static final f f16177h = new f(9);

    /* renamed from: i, reason: collision with root package name */
    public static final h f16178i = new h(2);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f16179a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final c f16180b;

    /* renamed from: c, reason: collision with root package name */
    public final r f16181c;

    /* renamed from: d, reason: collision with root package name */
    public final j f16182d;

    public a(c cVar, r rVar, j jVar) {
        this.f16180b = cVar;
        this.f16181c = rVar;
        this.f16182d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[Segment.SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i5 = fileInputStream.read(bArr);
                if (i5 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f16174e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f16174e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.f16180b;
        arrayList.addAll(c.h(((File) cVar.f16189f).listFiles()));
        arrayList.addAll(c.h(((File) cVar.f16190g).listFiles()));
        f fVar = f16177h;
        Collections.sort(arrayList, fVar);
        List listH = c.h(((File) cVar.f16188e).listFiles());
        Collections.sort(listH, fVar);
        arrayList.addAll(listH);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.h(((File) this.f16180b.f16187d).list())).descendingSet();
    }

    public final void d(L0 l02, String str, boolean z2) {
        c cVar = this.f16180b;
        i iVar = this.f16181c.c().f17032a;
        f16176g.getClass();
        try {
            f(cVar.d(str, AbstractC0279p0.l("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f16179a.getAndIncrement())), z2 ? Constants.USER_ID_SEPARATOR : "")), V8.a.f13166a.j(l02));
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e7);
        }
        h hVar = new h(3);
        cVar.getClass();
        File file = new File((File) cVar.f16187d, str);
        file.mkdirs();
        List<File> listH = c.h(file.listFiles(hVar));
        Collections.sort(listH, new f(10));
        int size = listH.size();
        for (File file2 : listH) {
            if (size <= iVar.f10117b) {
                return;
            }
            c.g(file2);
            size--;
        }
    }
}
