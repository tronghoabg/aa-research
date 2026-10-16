package com.waze.ifs.ui;

import android.content.Context;
import android.widget.SectionIndexer;
import com.waze.settings.gw;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends u implements SectionIndexer {

    /* renamed from: a, reason: collision with root package name */
    String[] f24572a;

    /* renamed from: b, reason: collision with root package name */
    int[] f24573b;

    /* renamed from: c, reason: collision with root package name */
    int[] f24574c;

    /* renamed from: d, reason: collision with root package name */
    int f24575d;

    public t(Context context) {
        super(context);
        this.f24575d = 0;
        this.f24572a = new String[64];
        this.f24573b = new int[64];
    }

    @Override // com.waze.ifs.ui.u
    public final void b(gw[] gwVarArr) {
        this.f24574c = new int[gwVarArr.length];
        char c2 = 65535;
        for (int i2 = 0; i2 < gwVarArr.length; i2++) {
            char cCharAt = gwVarArr[i2].f37350c.charAt(0);
            if (cCharAt != c2) {
                String[] strArr = this.f24572a;
                int i3 = this.f24575d;
                StringBuilder sb = new StringBuilder();
                sb.append(cCharAt);
                strArr[i3] = sb.toString();
                int[] iArr = this.f24573b;
                int i4 = this.f24575d;
                iArr[i4] = i2;
                this.f24575d = i4 + 1;
                c2 = cCharAt;
            }
            int[] iArr2 = this.f24574c;
            int i5 = this.f24575d;
            iArr2[i2] = i5 - 1;
            if (i5 == 64) {
                break;
            }
        }
        this.f24572a = (String[]) Arrays.copyOf(this.f24572a, this.f24575d);
        this.f24573b = Arrays.copyOf(this.f24573b, this.f24575d);
        super.b(gwVarArr);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i2) {
        int[] iArr = this.f24573b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i2) {
        int[] iArr = this.f24574c;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        return this.f24572a;
    }
}
