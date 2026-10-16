package Va;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.view.View;

/* renamed from: Va.qa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1116qa extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public static int f14539a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f14540b = 1;

    public static String a(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-1398363326624545998L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-1398363326624545998L)));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        f14539a = (f14540b + 109) % 128;
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(a((-1) - TextUtils.lastIndexOf("", '0'), "\udd2d\udd7d䑭쁀܍䙥瑲붣톨\u0bd6卌ꉊ쓒ᣝ忑霽\ufb12ⶉ沣鯷\uee68㉆秹袋\ue28b").intern());
            f14540b = (f14539a + 95) % 128;
        }
        sQLiteDatabase.execSQL(a(View.getDefaultSize(0, 0), "噘嘛䛿䚮֟삏ᰝ헊嫄ी햢쨗侉᩿\ud916ｾ瀠⼼\uea54\uf3d3收モｾ\ue08b槵얽肫ᔰ᪼쥎閚ਰབ\uda0a餁㽧ぷ\uefffꩯ㏣┻\uf0a0뾻₣⧜薸䃂唯\udae0襥吀䩺콵騬夸纲\uf050꿮橧珺\ue484냽羌惺\ue98c䐵æ锖骀䤙ᑣ").intern());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        f14539a = (f14540b + 63) % 128;
    }
}
