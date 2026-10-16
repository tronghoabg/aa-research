package com.bykv.vk.openvk.uef.uef.oa.yo;

import com.bykv.vk.openvk.uef.uef.oa.yo.yo;

/* loaded from: classes.dex */
public abstract class uef implements yo {
    private yo.moa bcc;
    private yo.xs ivm;
    private yo.ivm lw;
    private yo.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private yo.lw f24511oa;
    protected boolean uef = false;
    private yo.InterfaceC0031yo xs;
    private yo.oa yo;

    public final void moa() {
        try {
            yo.ivm ivmVar = this.lw;
            if (ivmVar != null) {
                ivmVar.yo(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void oa() {
        try {
            yo.lw lwVar = this.f24511oa;
            if (lwVar != null) {
                lwVar.oa(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.lw lwVar) {
        this.f24511oa = lwVar;
    }

    public final void yo() {
        try {
            yo.oa oaVar = this.yo;
            if (oaVar != null) {
                oaVar.uef(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.oa oaVar) {
        this.yo = oaVar;
    }

    public final boolean oa(int i5, int i10) {
        try {
            yo.moa moaVar = this.bcc;
            if (moaVar != null) {
                if (moaVar.oa(this, i5, i10)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.uef uefVar) {
        this.moa = uefVar;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.ivm ivmVar) {
        this.lw = ivmVar;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.InterfaceC0031yo interfaceC0031yo) {
        this.xs = interfaceC0031yo;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.moa moaVar) {
        this.bcc = moaVar;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public final void uef(yo.xs xsVar) {
        this.ivm = xsVar;
    }

    public void uef() {
        this.f24511oa = null;
        this.moa = null;
        this.yo = null;
        this.lw = null;
        this.ivm = null;
        this.xs = null;
        this.bcc = null;
    }

    public final void uef(int i5) {
        try {
            yo.uef uefVar = this.moa;
            if (uefVar != null) {
                uefVar.uef(this, i5);
            }
        } catch (Throwable unused) {
        }
    }

    public final void uef(int i5, int i10, int i11, int i12) {
        try {
            yo.xs xsVar = this.ivm;
            if (xsVar != null) {
                xsVar.uef(this, i5, i10, i11, i12);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean uef(int i5, int i10) {
        try {
            yo.InterfaceC0031yo interfaceC0031yo = this.xs;
            if (interfaceC0031yo != null) {
                if (interfaceC0031yo.uef(this, i5, i10)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo
    public void uef(boolean z2) {
        this.uef = z2;
    }
}
