package R1;

import android.content.Context;
import android.view.KeyCharacterMap;
import r7.InterfaceC3932b;

/* loaded from: classes.dex */
public final class i implements InterfaceC3932b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10116a;

    /* renamed from: b, reason: collision with root package name */
    public int f10117b;

    public /* synthetic */ i(int i5) {
        this.f10116a = i5;
    }

    @Override // r7.InterfaceC3932b
    public int a(Context context, String str, boolean z2) {
        return 0;
    }

    public Character b(int i5) {
        char c10 = (char) i5;
        if ((Integer.MIN_VALUE & i5) != 0) {
            int i10 = i5 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            int i11 = this.f10117b;
            if (i11 != 0) {
                this.f10117b = KeyCharacterMap.getDeadChar(i11, i10);
            } else {
                this.f10117b = i10;
            }
        } else {
            int i12 = this.f10117b;
            if (i12 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i12, i5);
                if (deadChar > 0) {
                    c10 = (char) deadChar;
                }
                this.f10117b = 0;
            }
        }
        return Character.valueOf(c10);
    }

    @Override // r7.InterfaceC3932b
    public int d(Context context, String str) {
        return this.f10117b;
    }

    public String toString() {
        switch (this.f10116a) {
            case 6:
                return String.valueOf(this.f10117b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(int i5, int i10, byte b5) {
        this.f10116a = i10;
        this.f10117b = i5;
    }

    public i() {
        this.f10116a = 2;
        this.f10117b = 0;
    }

    public i(int i5, int i10) {
        this.f10116a = 4;
        A6.c.z((i5 & 1) == i5, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i5), 1);
        A6.c.z((i10 & 1) == i5, "Cannot supply target ID from different generator ID", new Object[0]);
        this.f10117b = i10;
    }
}
