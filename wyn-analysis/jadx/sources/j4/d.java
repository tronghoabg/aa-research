package J4;

import A7.V1;
import I4.p;
import I4.q;
import I4.v;
import Jd.j;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import d1.InterfaceMenuItemC2385a;
import j.w;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import md.AbstractC3536d;
import md.C3535c;
import p.r;
import r7.AbstractC3935e;
import x.C4429v;

/* loaded from: classes.dex */
public abstract class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5597a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5598b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5599c;

    public d(String content, List parameters) {
        this.f5597a = 1;
        AbstractC3340k.e(content, "content");
        AbstractC3340k.e(parameters, "parameters");
        this.f5598b = content;
        this.f5599c = parameters;
    }

    public void c() {
        V1 v1 = (V1) this.f5598b;
        if (v1 != null) {
            try {
                ((w) this.f5599c).k.unregisterReceiver(v1);
            } catch (IllegalArgumentException unused) {
            }
            this.f5598b = null;
        }
    }

    @Override // I4.q
    public p d(v vVar) {
        Class cls = (Class) this.f5599c;
        return new g((Context) this.f5598b, vVar.b(File.class, cls), vVar.b(Uri.class, cls), cls);
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i5);

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC2385a)) {
            return menuItem;
        }
        InterfaceMenuItemC2385a interfaceMenuItemC2385a = (InterfaceMenuItemC2385a) menuItem;
        if (((C4429v) this.f5599c) == null) {
            this.f5599c = new C4429v(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C4429v) this.f5599c).get(interfaceMenuItemC2385a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        r rVar = new r((Context) this.f5598b, interfaceMenuItemC2385a);
        ((C4429v) this.f5599c).put(interfaceMenuItemC2385a, rVar);
        return rVar;
    }

    public int[] i(int i5, int i10) {
        if (i5 < 0 || i10 < 0 || i5 == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f5599c;
        iArr[0] = i5;
        iArr[1] = i10;
        return iArr;
    }

    public String j() {
        String str = (String) this.f5598b;
        if (str != null) {
            return str;
        }
        AbstractC3340k.m("text");
        throw null;
    }

    public abstract void k();

    public String l(String name) {
        AbstractC3340k.e(name, "name");
        List list = (List) this.f5599c;
        int iZ = AbstractC3935e.z(list);
        if (iZ < 0) {
            return null;
        }
        int i5 = 0;
        while (true) {
            j jVar = (j) list.get(i5);
            if (Bf.r.c0(jVar.f6058a, name, true)) {
                return jVar.f6059b;
            }
            if (i5 == iZ) {
                return null;
            }
            i5++;
        }
    }

    public abstract int[] m(int i5);

    public void n() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((V1) this.f5598b) == null) {
            this.f5598b = new V1(this, 11);
        }
        ((w) this.f5599c).k.registerReceiver((V1) this.f5598b, intentFilterE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e A[LOOP:1: B:16:0x0058->B:68:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.d.toString():java.lang.String");
    }

    public d(Context context) {
        this.f5597a = 3;
        this.f5598b = context;
    }

    public d() {
        this.f5597a = 4;
        this.f5599c = new int[2];
    }

    public d(AbstractC3536d abstractC3536d, C3535c c3535c) {
        this.f5597a = 5;
        Fe.e.t(abstractC3536d, "channel");
        this.f5598b = abstractC3536d;
        Fe.e.t(c3535c, "callOptions");
        this.f5599c = c3535c;
    }

    public d(Context context, Class cls) {
        this.f5597a = 0;
        this.f5598b = context;
        this.f5599c = cls;
    }

    public d(w wVar) {
        this.f5597a = 2;
        this.f5599c = wVar;
    }
}
