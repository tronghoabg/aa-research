package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f20325a;

    /* renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f20326b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f20327c;

    private a() {
    }

    public static a a() {
        if (f20325a == null) {
            synchronized (a.class) {
                try {
                    if (f20325a == null) {
                        f20325a = new a();
                    }
                } finally {
                }
            }
        }
        return f20325a;
    }

    private void b() {
        if (this.f20326b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f20327c = new b(context).getWritableDatabase();
        } finally {
            this.f20326b = new com.apm.insight.e.a.b();
        }
        this.f20326b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f20326b;
        if (bVar != null) {
            bVar.a(this.f20327c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f20326b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f20327c, str);
    }
}
