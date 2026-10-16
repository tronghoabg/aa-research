package androidx.sqlite.db;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SupportSQLiteQuery {
    void bindTo(SupportSQLiteProgram supportSQLiteProgram);

    int getArgCount();

    String getSql();
}
