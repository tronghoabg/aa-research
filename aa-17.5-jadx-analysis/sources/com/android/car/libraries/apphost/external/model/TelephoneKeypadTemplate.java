package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import defpackage.gkl;
import defpackage.gkp;
import defpackage.gkq;
import defpackage.rb;
import defpackage.uc;
import defpackage.wb;
import defpackage.we;
import defpackage.wf;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

@rb
/* loaded from: classes2.dex */
public class TelephoneKeypadTemplate implements wb {
    private static final wf HEADER_ACTION_CONSTRAINT;
    private static final wf KEYPAD_TEMPLATE_ACTION_CONSTRAINTS;
    private final uc mDialedNumberChangedDelegate;
    private final Header mHeader;
    private final gkl mKeypadEventListenerDelegate;
    private final Map<Integer, CarText> mKeypadKeySecondaryText;
    private final String mPhoneNumber;
    private final Action mPrimaryAction;

    static {
        we weVar = new we(wf.a);
        weVar.a(Action.TYPE_APP_ICON);
        weVar.a(Action.TYPE_BACK);
        HEADER_ACTION_CONSTRAINT = new wf(weVar);
        we weVar2 = new we();
        weVar2.d = 1;
        weVar2.i = true;
        weVar2.c();
        weVar2.a(1);
        weVar2.f = 0;
        KEYPAD_TEMPLATE_ACTION_CONSTRAINTS = new wf(weVar2);
    }

    public TelephoneKeypadTemplate(DialpadTemplate dialpadTemplate) {
        this.mHeader = dialpadTemplate.getHeader();
        this.mPhoneNumber = dialpadTemplate.getPhoneNumber();
        this.mPrimaryAction = dialpadTemplate.getPrimaryAction();
        this.mKeypadEventListenerDelegate = dialpadTemplate.getKeyListenerDelegate();
        this.mDialedNumberChangedDelegate = dialpadTemplate.getDialedNumberChangedDelegate();
        this.mKeypadKeySecondaryText = dialpadTemplate.getKeypadKeySecondaryText();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelephoneKeypadTemplate)) {
            return false;
        }
        TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
        if (Objects.equals(this.mHeader, telephoneKeypadTemplate.mHeader) && Objects.equals(this.mPhoneNumber, telephoneKeypadTemplate.mPhoneNumber) && Objects.equals(this.mPrimaryAction, telephoneKeypadTemplate.mPrimaryAction)) {
            if ((this.mKeypadEventListenerDelegate == null) == (telephoneKeypadTemplate.mKeypadEventListenerDelegate == null)) {
                if ((this.mDialedNumberChangedDelegate == null) == (telephoneKeypadTemplate.mDialedNumberChangedDelegate == null) && this.mKeypadKeySecondaryText.size() == telephoneKeypadTemplate.mKeypadKeySecondaryText.size() && this.mKeypadKeySecondaryText.entrySet().containsAll(telephoneKeypadTemplate.mKeypadKeySecondaryText.entrySet())) {
                    return true;
                }
            }
        }
        return false;
    }

    public uc getDialedNumberChangedDelegate() {
        return this.mDialedNumberChangedDelegate;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public gkl getKeyListenerDelegate() {
        return this.mKeypadEventListenerDelegate;
    }

    public Map<Integer, CarText> getKeypadKeySecondaryText() {
        return this.mKeypadKeySecondaryText;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public Action getPrimaryAction() {
        return this.mPrimaryAction;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mPhoneNumber, this.mPrimaryAction, Boolean.valueOf(this.mKeypadEventListenerDelegate == null), Boolean.valueOf(this.mDialedNumberChangedDelegate == null), this.mKeypadKeySecondaryText);
    }

    public String toString() {
        Map<Integer, CarText> map = this.mKeypadKeySecondaryText;
        Action action = this.mPrimaryAction;
        return "TelephoneKeypadTemplate { header: " + String.valueOf(this.mHeader) + "; phone number: " + this.mPhoneNumber + "; primaryAction: " + String.valueOf(action) + "; secondaryTextMap: " + String.valueOf(map) + " }";
    }

    public TelephoneKeypadTemplate() {
        this.mHeader = null;
        this.mPhoneNumber = null;
        this.mPrimaryAction = null;
        this.mKeypadEventListenerDelegate = null;
        this.mDialedNumberChangedDelegate = null;
        this.mKeypadKeySecondaryText = new HashMap(0);
    }

    /* synthetic */ TelephoneKeypadTemplate(gkp gkpVar, gkq gkqVar) {
        this(gkpVar);
    }

    private TelephoneKeypadTemplate(gkp gkpVar) {
        Header header = gkpVar.a;
        this.mHeader = null;
        String str = gkpVar.b;
        this.mPhoneNumber = null;
        Action action = gkpVar.c;
        this.mPrimaryAction = null;
        gkl gklVar = gkpVar.d;
        this.mKeypadEventListenerDelegate = null;
        uc ucVar = gkpVar.e;
        this.mDialedNumberChangedDelegate = null;
        Map map = gkpVar.f;
        this.mKeypadKeySecondaryText = null;
    }
}
