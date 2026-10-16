package com.waze.gw;

/* loaded from: classes10.dex */
final class HudCanonicalAlert {
    final int distanceM;
    final String rawRow;
    final int type;
    final int valueKmh;

    HudCanonicalAlert(String str, int i2, int i3, int i4) {
        this.rawRow = str;
        this.type = i2;
        this.valueKmh = i3;
        this.distanceM = i4;
    }

    static HudCanonicalAlert fromLegacyRow(String str) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        String[] strArrSplit = str == null ? new String[0] : str.split("\\t", -1);
        if (strArrSplit.length < 4) {
            i2 = 0;
        } else {
            int[] iArrDecode = HudAlertCodec.decode(strArrSplit);
            i4 = iArrDecode[0];
            i2 = iArrDecode[1];
            i3 = parseInt(strArrSplit[3], -1);
        }
        return new HudCanonicalAlert(str, i4, i2, i3);
    }

    boolean hasLegacyPayload() {
        return this.rawRow != null && this.rawRow.split("\\t", -1).length >= 4;
    }

    public String toString() {
        return String.valueOf(this.rawRow);
    }

    private static int parseInt(String str, int i2) {
        try {
            return Integer.parseInt(str.trim());
        } catch (Throwable th) {
            return i2;
        }
    }
}
