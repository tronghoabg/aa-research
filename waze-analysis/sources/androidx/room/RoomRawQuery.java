package androidx.room;

import androidx.sqlite.SQLiteStatement;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RoomRawQuery {
    private final l<SQLiteStatement, ab> bindingFunction;
    private final String sql;

    public RoomRawQuery(String str, final l<? super SQLiteStatement, ab> lVar) {
        x.f(str, "sql");
        x.f(lVar, "onBindStatement");
        this.sql = str;
        this.bindingFunction = new l() { // from class: androidx.room.RoomRawQuery$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RoomRawQuery.bindingFunction$lambda$1(lVar, (SQLiteStatement) obj);
            }
        };
    }

    static final ab _init_$lambda$0(SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "it");
        return ab.f48028a;
    }

    static final ab bindingFunction$lambda$1(l lVar, SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "it");
        lVar.invoke(new BindOnlySQLiteStatement(sQLiteStatement));
        return ab.f48028a;
    }

    public final l<SQLiteStatement, ab> getBindingFunction() {
        return this.bindingFunction;
    }

    public final String getSql() {
        return this.sql;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomRawQuery(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        x.f(str, "sql");
    }

    public /* synthetic */ RoomRawQuery(String str, l lVar, int i2, o oVar) {
        this(str, (i2 & 2) != 0 ? new l() { // from class: androidx.room.RoomRawQuery$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RoomRawQuery._init_$lambda$0((SQLiteStatement) obj);
            }
        } : lVar);
    }
}
