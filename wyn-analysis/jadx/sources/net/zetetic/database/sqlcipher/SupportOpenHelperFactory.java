package net.zetetic.database.sqlcipher;

import o3.C3645b;
import o3.InterfaceC3646c;
import o3.d;

/* loaded from: classes5.dex */
public class SupportOpenHelperFactory implements InterfaceC3646c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f41172a;

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabaseHook f41173b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41175d;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    @Override // o3.InterfaceC3646c
    public final d c(C3645b c3645b) {
        int i5 = this.f41175d;
        if (i5 == -1) {
            return new SupportHelper(c3645b, this.f41172a, this.f41173b, this.f41174c);
        }
        return new SupportHelper(c3645b, this.f41172a, this.f41173b, this.f41174c, i5);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z2) {
        this(bArr, sQLiteDatabaseHook, z2, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z2, int i5) {
        this.f41172a = bArr;
        this.f41173b = sQLiteDatabaseHook;
        this.f41174c = z2;
        this.f41175d = i5;
    }
}
