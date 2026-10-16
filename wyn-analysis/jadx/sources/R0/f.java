package R0;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f10061d;

    /* renamed from: f, reason: collision with root package name */
    public int f10063f;

    /* renamed from: g, reason: collision with root package name */
    public int f10064g;

    /* renamed from: a, reason: collision with root package name */
    public o f10058a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10059b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10060c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f10062e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f10065h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f10066i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10067j = false;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10068l = new ArrayList();

    public f(o oVar) {
        this.f10061d = oVar;
    }

    @Override // R0.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f10068l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f10067j) {
                return;
            }
        }
        this.f10060c = true;
        o oVar = this.f10058a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f10059b) {
            this.f10061d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i5 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i5++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i5 == 1 && fVar.f10067j) {
            g gVar = this.f10066i;
            if (gVar != null) {
                if (!gVar.f10067j) {
                    return;
                } else {
                    this.f10063f = this.f10065h * gVar.f10064g;
                }
            }
            d(fVar.f10064g + this.f10063f);
        }
        o oVar2 = this.f10058a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.k.add(oVar);
        if (this.f10067j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f10068l.clear();
        this.k.clear();
        this.f10067j = false;
        this.f10064g = 0;
        this.f10060c = false;
        this.f10059b = false;
    }

    public void d(int i5) {
        if (this.f10067j) {
            return;
        }
        this.f10067j = true;
        this.f10064g = i5;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10061d.f10081b.f9555h0);
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        switch (this.f10062e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.f10067j ? Integer.valueOf(this.f10064g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f10068l.size());
        sb2.append(":d=");
        sb2.append(this.k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
