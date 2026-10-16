package a4;

import A7.C0237b0;
import cg.y;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: a4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329b {

    /* renamed from: a, reason: collision with root package name */
    public final String f17342a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17343b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17344c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17345d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17347f;

    /* renamed from: g, reason: collision with root package name */
    public C0237b0 f17348g;

    /* renamed from: h, reason: collision with root package name */
    public int f17349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f17350i;

    public C1329b(f fVar, String str) {
        this.f17350i = fVar;
        this.f17342a = str;
        fVar.getClass();
        this.f17343b = new long[2];
        fVar.getClass();
        this.f17344c = new ArrayList(2);
        fVar.getClass();
        this.f17345d = new ArrayList(2);
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        fVar.getClass();
        for (int i5 = 0; i5 < 2; i5++) {
            sb2.append(i5);
            this.f17344c.add(this.f17350i.f17357a.d(sb2.toString()));
            sb2.append(".tmp");
            this.f17345d.add(this.f17350i.f17357a.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final C1330c a() {
        if (this.f17346e && this.f17348g == null && !this.f17347f) {
            ArrayList arrayList = this.f17344c;
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                f fVar = this.f17350i;
                if (i5 >= size) {
                    this.f17349h++;
                    return new C1330c(fVar, this);
                }
                if (fVar.f17371p.c((y) arrayList.get(i5))) {
                    i5++;
                } else {
                    try {
                        fVar.B(this);
                        return null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return null;
    }
}
