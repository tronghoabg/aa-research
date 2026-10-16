package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fkh implements defpackage.fap {
    private final /* synthetic */ int a;

    public fkh(int i) {
        this.a = i;
    }

    @Override // defpackage.fap
    public final void a(defpackage.fbs fbsVar) {
        if (this.a == 0) {
            fbsVar.e("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
            return;
        }
        fbsVar.e("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("last_enqueue_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int i = 0;
        java.lang.Object[] objArr = new java.lang.Object[0];
        if (contentValues.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        java.lang.Object[] objArr2 = new java.lang.Object[size];
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UPDATE ");
        sb.append(defpackage.fbz.a[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (java.lang.String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < size; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        defpackage.fcg fcgVarI = ((defpackage.fbz) fbsVar).i(sb.toString());
        while (i < size) {
            java.lang.Object obj = objArr2[i];
            i++;
            if (obj == null) {
                fcgVarI.d(i);
            } else if (obj instanceof byte[]) {
                fcgVarI.a(i, (byte[]) obj);
            } else if (obj instanceof java.lang.Float) {
                fcgVarI.b(i, ((java.lang.Number) obj).floatValue());
            } else if (obj instanceof java.lang.Double) {
                fcgVarI.b(i, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.Long) {
                fcgVarI.c(i, ((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.Integer) {
                fcgVarI.c(i, ((java.lang.Number) obj).intValue());
            } else if (obj instanceof java.lang.Short) {
                fcgVarI.c(i, ((java.lang.Number) obj).shortValue());
            } else if (obj instanceof java.lang.Byte) {
                fcgVarI.c(i, ((java.lang.Number) obj).byteValue());
            } else if (obj instanceof java.lang.String) {
                fcgVarI.e(i, (java.lang.String) obj);
            } else {
                if (!(obj instanceof java.lang.Boolean)) {
                    throw new java.lang.IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                fcgVarI.c(i, true != ((java.lang.Boolean) obj).booleanValue() ? 0L : 1L);
            }
        }
        fcgVarI.a.executeUpdateDelete();
    }
}
