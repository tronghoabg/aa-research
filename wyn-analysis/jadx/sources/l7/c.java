package l7;

import com.google.android.gms.common.internal.AbstractC1732v;
import f7.InterfaceC2616c;

/* loaded from: classes3.dex */
public abstract class c extends AbstractC3398b implements InterfaceC2616c {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC3398b abstractC3398b = (AbstractC3398b) obj;
        for (C3397a c3397a : getFieldMappings().values()) {
            if (isFieldSet(c3397a)) {
                if (!abstractC3398b.isFieldSet(c3397a) || !AbstractC1732v.m(getFieldValue(c3397a), abstractC3398b.getFieldValue(c3397a))) {
                    return false;
                }
            } else if (abstractC3398b.isFieldSet(c3397a)) {
                return false;
            }
        }
        return true;
    }

    @Override // l7.AbstractC3398b
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (C3397a c3397a : getFieldMappings().values()) {
            if (isFieldSet(c3397a)) {
                Object fieldValue = getFieldValue(c3397a);
                AbstractC1732v.i(fieldValue);
                iHashCode = (iHashCode * 31) + fieldValue.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // l7.AbstractC3398b
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
