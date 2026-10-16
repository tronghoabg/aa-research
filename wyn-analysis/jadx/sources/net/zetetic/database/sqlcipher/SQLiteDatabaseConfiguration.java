package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class SQLiteDatabaseConfiguration {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f41124i = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");

    /* renamed from: a, reason: collision with root package name */
    public final String f41125a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41126b;

    /* renamed from: c, reason: collision with root package name */
    public int f41127c;

    /* renamed from: d, reason: collision with root package name */
    public int f41128d;

    /* renamed from: e, reason: collision with root package name */
    public Locale f41129e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f41130f;

    /* renamed from: g, reason: collision with root package name */
    public SQLiteDatabaseHook f41131g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f41132h;

    public SQLiteDatabaseConfiguration(String str, int i5) {
        this(str, i5, null, null);
    }

    public final void a(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.f41125a.equals(sQLiteDatabaseConfiguration.f41125a)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.f41127c = sQLiteDatabaseConfiguration.f41127c;
        this.f41128d = sQLiteDatabaseConfiguration.f41128d;
        this.f41129e = sQLiteDatabaseConfiguration.f41129e;
        this.f41130f = sQLiteDatabaseConfiguration.f41130f;
        this.f41131g = sQLiteDatabaseConfiguration.f41131g;
        ArrayList arrayList = this.f41132h;
        arrayList.clear();
        arrayList.addAll(sQLiteDatabaseConfiguration.f41132h);
    }

    public SQLiteDatabaseConfiguration(String str, int i5, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.f41132h = new ArrayList();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.f41125a = str;
        int iIndexOf = str.indexOf(63);
        str = iIndexOf >= 0 ? (String) str.subSequence(0, iIndexOf) : str;
        this.f41126b = str.indexOf(64) != -1 ? f41124i.matcher(str).replaceAll("XX@YY") : str;
        this.f41127c = i5;
        this.f41130f = bArr;
        this.f41131g = sQLiteDatabaseHook;
        this.f41128d = 25;
        this.f41129e = Locale.getDefault();
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.f41132h = new ArrayList();
        if (sQLiteDatabaseConfiguration != null) {
            this.f41125a = sQLiteDatabaseConfiguration.f41125a;
            this.f41126b = sQLiteDatabaseConfiguration.f41126b;
            a(sQLiteDatabaseConfiguration);
            return;
        }
        throw new IllegalArgumentException("other must not be null.");
    }
}
