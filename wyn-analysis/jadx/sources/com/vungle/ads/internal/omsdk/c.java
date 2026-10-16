package com.vungle.ads.internal.omsdk;

import C8.g;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okio.Segment;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.R;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33464a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f33465b;

    /* renamed from: c, reason: collision with root package name */
    public AtomicReference f33466c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicReference f33467d;

    public c(Context context) {
        AbstractC3340k.e(context, "context");
        this.f33464a = context;
        this.f33465b = new Handler(Looper.getMainLooper());
        this.f33466c = new AtomicReference(null);
        this.f33467d = new AtomicReference(null);
    }

    public static final void a(c this$0) {
        Object objZ;
        AbstractC3340k.e(this$0, "this$0");
        try {
            if (!Omid.isActive()) {
                Omid.activate(this$0.f33464a);
            }
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = l.a("error: ");
            sbA.append(thA.getLocalizedMessage());
            t.b("OMInjector", sbA.toString());
        }
    }

    public final void b() {
        this.f33465b.post(new g(this, 3));
    }

    public final void a(File dir) throws IOException {
        FileWriter fileWriter;
        AbstractC3340k.e(dir, "dir");
        ArrayList arrayList = new ArrayList();
        File file = new File(dir, "omsdk.js");
        if (!file.exists()) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = l.a("injecting omsdk.js to ");
            sbA.append(file.getAbsolutePath());
            t.a("OMInjector", sbA.toString());
            String strA = a();
            if (strA != null) {
                fileWriter = new FileWriter(file);
                try {
                    fileWriter.write(strA);
                    fileWriter.flush();
                    fileWriter.close();
                } finally {
                }
            }
            arrayList.add(file);
        }
        File file2 = new File(dir, "omsdk-session.js");
        if (file2.exists()) {
            return;
        }
        boolean z10 = u.f33874a;
        StringBuilder sbA2 = l.a("injecting omsdk-session.js to ");
        sbA2.append(file2.getAbsolutePath());
        t.a("OMInjector", sbA2.toString());
        String strA2 = (String) this.f33467d.get();
        if (strA2 == null) {
            strA2 = a(R.raw.omid_session_client_v1_6_2);
            this.f33467d.set(strA2);
        }
        if (strA2 != null) {
            fileWriter = new FileWriter(file2);
            try {
                fileWriter.write(strA2);
                fileWriter.flush();
                fileWriter.close();
            } finally {
            }
        }
        arrayList.add(file2);
    }

    public final String a() {
        String str = (String) this.f33466c.get();
        if (str != null) {
            return str;
        }
        String strA = a(R.raw.omsdk_v1_6_2);
        this.f33466c.set(strA);
        return strA;
    }

    public final String a(int i5) {
        Object objZ;
        try {
            InputStream inputStreamOpenRawResource = this.f33464a.getResources().openRawResource(i5);
            AbstractC3340k.d(inputStreamOpenRawResource, "context.resources.openRawResource(resId)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Bf.a.f1670a), Segment.SIZE);
            try {
                objZ = Fe.c.C(bufferedReader);
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (objZ instanceof C2529m) {
            objZ = null;
        }
        return (String) objZ;
    }
}
