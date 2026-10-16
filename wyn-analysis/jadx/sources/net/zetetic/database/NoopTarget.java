package net.zetetic.database;

/* loaded from: classes5.dex */
public class NoopTarget implements LogTarget {
    @Override // net.zetetic.database.LogTarget
    public final boolean b(int i5, String str) {
        return false;
    }

    @Override // net.zetetic.database.LogTarget
    public final void a(int i5, Exception exc, String str, String str2) {
    }
}
