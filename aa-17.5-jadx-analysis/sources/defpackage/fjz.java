package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class fjz implements faj {
    private final /* synthetic */ int a;

    public fjz(int i) {
        this.a = i;
    }

    @Override // defpackage.faj
    public final void a(fbl fblVar) throws SQLException {
        if (this.a == 0) {
            fblVar.e("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
            return;
        }
        fblVar.e("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        int i = 0;
        Object[] objArr = new Object[0];
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        Object[] objArr2 = new Object[size];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(fbs.a[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < size; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        fbz fbzVarI = ((fbs) fblVar).i(sb.toString());
        while (i < size) {
            Object obj = objArr2[i];
            i++;
            if (obj == null) {
                fbzVarI.d(i);
            } else if (obj instanceof byte[]) {
                fbzVarI.a(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                fbzVarI.b(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                fbzVarI.b(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                fbzVarI.c(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                fbzVarI.c(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                fbzVarI.c(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                fbzVarI.c(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                fbzVarI.e(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                fbzVarI.c(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
            }
        }
        fbzVarI.a.executeUpdateDelete();
    }
}
