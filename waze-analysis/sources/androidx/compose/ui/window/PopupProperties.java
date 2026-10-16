package androidx.compose.ui.window;

import android.os.IBinder;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final int flags;
    private final boolean inheritSecurePolicy;
    private final boolean usePlatformDefaultWidth;
    private final IBinder windowToken;
    private final int windowType;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PopupProperties(boolean r11, boolean r12, boolean r13, androidx.compose.ui.window.SecureFlagPolicy r14, boolean r15, boolean r16, boolean r17, int r18, android.os.IBinder r19, int r20, h.g.b.o r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L8
            androidx.compose.ui.window.SecureFlagPolicy r14 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L8:
            r4 = r14
            r14 = r0 & 4
            r1 = r0 & 2
            r2 = 0
            r3 = 1
            if (r14 == 0) goto L13
            r14 = r2
            goto L14
        L13:
            r14 = r3
        L14:
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            r5 = r0 & 1
            r14 = r14 ^ r3
            r1 = r1 ^ r3
            r5 = r5 ^ r3
            r13 = r13 | r14
            r12 = r12 | r1
            r11 = r11 & r5
            r14 = r0 & 16
            if (r14 == 0) goto L27
            r14 = r2
            goto L28
        L27:
            r14 = r3
        L28:
            r14 = r14 ^ r3
            r5 = r14 | r15
            r14 = r0 & 32
            if (r14 == 0) goto L31
            r14 = r2
            goto L32
        L31:
            r14 = r3
        L32:
            r14 = r14 ^ r3
            r6 = r14 | r16
            r14 = r0 & 64
            if (r14 == 0) goto L3b
            r14 = r2
            goto L3c
        L3b:
            r14 = r3
        L3c:
            r7 = r14 & r17
            r14 = r0 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L46
            r14 = 1002(0x3ea, float:1.404E-42)
            r8 = r14
            goto L48
        L46:
            r8 = r18
        L48:
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L4f
            r14 = 0
            r9 = r14
            goto L51
        L4f:
            r9 = r19
        L51:
            if (r3 == r11) goto L58
            r1 = r2
            r0 = r10
            r3 = r13
            r2 = r12
            goto L5c
        L58:
            r1 = r3
            r0 = r10
            r2 = r12
            r3 = r13
        L5c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, boolean, int, android.os.IBinder, int, h.g.b.o):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.flags == popupProperties.flags && this.inheritSecurePolicy == popupProperties.inheritSecurePolicy && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth && this.windowType == popupProperties.windowType && x.n(this.windowToken, popupProperties.windowToken);
    }

    public final boolean getClippingEnabled() {
        return (this.flags & 512) == 0;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final int getFlags$ui() {
        return this.flags;
    }

    public final boolean getFocusable() {
        return (this.flags & 8) == 0;
    }

    public final boolean getInheritSecurePolicy$ui() {
        return this.inheritSecurePolicy;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.inheritSecurePolicy ? SecureFlagPolicy.Inherit : (this.flags & 8192) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        IBinder iBinder = this.windowToken;
        int iHashCode = iBinder != null ? iBinder.hashCode() : 0;
        boolean z = this.inheritSecurePolicy;
        return (((((((((((((this.flags * 31) + PopupProperties$$ExternalSyntheticBackport0.m(z)) * 31) + PopupProperties$$ExternalSyntheticBackport0.m(this.dismissOnBackPress)) * 31) + PopupProperties$$ExternalSyntheticBackport0.m(this.dismissOnClickOutside)) * 31) + PopupProperties$$ExternalSyntheticBackport0.m(this.excludeFromSystemGesture)) * 31) + PopupProperties$$ExternalSyntheticBackport0.m(this.usePlatformDefaultWidth)) * 31) + this.windowType) * 31) + iHashCode;
    }

    public /* synthetic */ PopupProperties(int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(i2, z, z2, z3, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, IBinder iBinder, int i4, o oVar) {
        this(i2, z | (!((i4 & 2) == 0)), z2 | (!((i4 & 4) == 0)), z3 | (!((i4 & 8) == 0)), z4 | (!((i4 & 16) == 0)), z5 & ((i4 & 32) == 0), (i4 & 64) != 0 ? 1002 : i3, (i4 & 128) != 0 ? null : iBinder);
    }

    public /* synthetic */ PopupProperties(int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, o oVar) {
        this(i2, z | (!((i3 & 2) == 0)), z2 | (!((i3 & 4) == 0)), z3 | (!((i3 & 8) == 0)), z4 | (!((i3 & 16) == 0)), z5 & ((i3 & 32) == 0));
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false, 0, null, 384, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PopupProperties(boolean r8, boolean r9, boolean r10, androidx.compose.ui.window.SecureFlagPolicy r11, boolean r12, boolean r13, int r14, h.g.b.o r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L6
            androidx.compose.ui.window.SecureFlagPolicy r11 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L6:
            r4 = r11
            r11 = r14 & 4
            r15 = r14 & 2
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L11
            r11 = r0
            goto L12
        L11:
            r11 = r1
        L12:
            if (r15 == 0) goto L16
            r15 = r0
            goto L17
        L16:
            r15 = r1
        L17:
            r2 = r14 & 1
            r11 = r11 ^ r1
            r15 = r15 ^ r1
            r2 = r2 ^ r1
            r3 = r11 | r10
            r9 = r9 | r15
            r8 = r8 & r2
            r10 = r14 & 16
            if (r10 == 0) goto L26
            r10 = r0
            goto L27
        L26:
            r10 = r1
        L27:
            r10 = r10 ^ r1
            r5 = r10 | r12
            r10 = r14 & 32
            if (r10 == 0) goto L30
            r10 = r0
            goto L31
        L30:
            r10 = r1
        L31:
            r10 = r10 ^ r1
            r6 = r10 | r13
            if (r1 == r8) goto L3a
            r1 = r0
            r2 = r9
            r0 = r7
            goto L3c
        L3a:
            r0 = r7
            r2 = r9
        L3c:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, h.g.b.o):void");
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, z6, 1002, (IBinder) null);
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i2, IBinder iBinder) {
        this(AndroidPopup_androidKt.createFlags(z, secureFlagPolicy, z5), secureFlagPolicy == SecureFlagPolicy.Inherit, z2, z3, z4, z6, i2, iBinder);
    }

    public PopupProperties(int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3, IBinder iBinder) {
        this.flags = i2;
        this.inheritSecurePolicy = z;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.excludeFromSystemGesture = z4;
        this.usePlatformDefaultWidth = z5;
        this.windowType = i3;
        this.windowToken = iBinder;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PopupProperties(boolean r9, boolean r10, boolean r11, androidx.compose.ui.window.SecureFlagPolicy r12, boolean r13, boolean r14, boolean r15, int r16, h.g.b.o r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            androidx.compose.ui.window.SecureFlagPolicy r12 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L6:
            r4 = r12
            r12 = r16 & 4
            r0 = r16 & 2
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L11
            r12 = r1
            goto L12
        L11:
            r12 = r2
        L12:
            if (r0 == 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            r3 = r16 & 1
            r12 = r12 ^ r2
            r0 = r0 ^ r2
            r3 = r3 ^ r2
            r11 = r11 | r12
            r10 = r10 | r0
            r9 = r9 & r3
            r12 = r16 & 16
            if (r12 == 0) goto L25
            r12 = r1
            goto L26
        L25:
            r12 = r2
        L26:
            r12 = r12 ^ r2
            r5 = r12 | r13
            r12 = r16 & 32
            if (r12 == 0) goto L2f
            r12 = r1
            goto L30
        L2f:
            r12 = r2
        L30:
            r12 = r12 ^ r2
            r6 = r12 | r14
            r12 = r16 & 64
            if (r12 == 0) goto L39
            r12 = r1
            goto L3a
        L39:
            r12 = r2
        L3a:
            r7 = r12 & r15
            if (r2 == r9) goto L42
            r0 = r8
            r2 = r10
            r3 = r11
            goto L46
        L42:
            r1 = r2
            r0 = r8
            r3 = r11
            r2 = r10
        L46:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, boolean, int, h.g.b.o):void");
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 | (!((i2 & 2) == 0)), z3 | (!((i2 & 4) == 0)), z4 | (!((i2 & 8) == 0)));
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 | (!((i2 & 2) == 0)), z3 | (!((i2 & 4) == 0)), z4 | (!((i2 & 8) == 0)), z5 & ((i2 & 16) == 0));
    }
}
