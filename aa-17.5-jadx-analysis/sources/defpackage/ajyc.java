package defpackage;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class ajyc implements Cloneable, Serializable, ajuu, ajui {
    private static final long serialVersionUID = -3869795591041535538L;
    private final String a;
    private final String b;
    public Map c = new HashMap();
    public String d;
    public int e;
    private String f;
    private Date g;
    private boolean h;

    public ajyc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ajui
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ajui
    public final String b() {
        return this.f;
    }

    @Override // defpackage.ajui
    public final String c() {
        return this.a;
    }

    public Object clone() throws CloneNotSupportedException {
        ajyc ajycVar = (ajyc) super.clone();
        ajycVar.c = new HashMap(this.c);
        return ajycVar;
    }

    @Override // defpackage.ajui
    public final String d() {
        return this.d;
    }

    @Override // defpackage.ajui
    public final String e() {
        return this.b;
    }

    @Override // defpackage.ajui
    public final Date f() {
        return this.g;
    }

    public boolean g(Date date) {
        Date date2 = this.g;
        return date2 != null && date2.getTime() <= date.getTime();
    }

    @Override // defpackage.ajui
    public final boolean h() {
        return this.h;
    }

    public int[] i() {
        return null;
    }

    @Override // defpackage.ajuu
    public final void j(String str) {
        this.f = str != null ? str.toLowerCase(Locale.ROOT) : null;
    }

    @Override // defpackage.ajuu
    public final void k(Date date) {
        this.g = date;
    }

    @Override // defpackage.ajuu
    public final void l(String str) {
        this.d = str;
    }

    @Override // defpackage.ajuu
    public final void m(int i) {
        this.e = i;
    }

    @Override // defpackage.ajuu
    public final void n() {
        this.h = true;
    }

    public final void o(String str, String str2) {
        this.c.put(str, str2);
    }

    public final boolean p(String str) {
        return this.c.containsKey(str);
    }

    public final String toString() {
        return "[version: " + Integer.toString(this.e) + "][name: " + this.a + "][value: " + this.b + "][domain: " + this.f + "][path: " + this.d + "][expiry: " + this.g + "]";
    }
}
