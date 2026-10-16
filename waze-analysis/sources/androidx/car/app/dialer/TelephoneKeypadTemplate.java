package androidx.car.app.dialer;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.InputCallback;
import androidx.car.app.model.InputCallbackDelegate;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.Template;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import j$.util.Objects;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class TelephoneKeypadTemplate implements Template {
    public static final int KEY_EIGHT = 8;
    public static final int KEY_FIVE = 5;
    public static final int KEY_FOUR = 4;
    public static final int KEY_NINE = 9;
    public static final int KEY_ONE = 1;
    public static final int KEY_POUND = 11;
    public static final int KEY_SEVEN = 7;
    public static final int KEY_SIX = 6;
    public static final int KEY_STAR = 10;
    public static final int KEY_THREE = 3;
    public static final int KEY_TWO = 2;
    public static final int KEY_ZERO = 0;
    private final Header mHeader;
    private final Map<Integer, CarText> mKeySecondaryTexts;
    private final String mPhoneNumber;
    private final InputCallbackDelegate mPhoneNumberChangedDelegate;
    private final Action mPrimaryAction;
    private final TelephoneKeypadCallbackDelegate mTelephoneKeypadCallbackDelegate;

    /* compiled from: WazeSource */
    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface KeypadKey {
    }

    /* compiled from: WazeSource */
    public interface PhoneNumberChangeListener {
        void onPhoneNumberChanged(String str);
    }

    private TelephoneKeypadTemplate(Builder builder) {
        this.mHeader = builder.mHeader;
        this.mPhoneNumber = builder.mPhoneNumber;
        this.mPrimaryAction = builder.mPrimaryAction;
        this.mTelephoneKeypadCallbackDelegate = builder.mTelephoneKeypadCallback;
        this.mPhoneNumberChangedDelegate = builder.mPhoneNumberChangedDelegate;
        this.mKeySecondaryTexts = builder.mKeySecondaryTexts;
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
            if ((this.mTelephoneKeypadCallbackDelegate == null) == (telephoneKeypadTemplate.mTelephoneKeypadCallbackDelegate == null)) {
                if ((this.mPhoneNumberChangedDelegate == null) == (telephoneKeypadTemplate.mPhoneNumberChangedDelegate == null) && this.mKeySecondaryTexts.size() == telephoneKeypadTemplate.mKeySecondaryTexts.size() && this.mKeySecondaryTexts.entrySet().containsAll(telephoneKeypadTemplate.mKeySecondaryTexts.entrySet())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public Map<Integer, CarText> getKeySecondaryTexts() {
        return this.mKeySecondaryTexts;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public InputCallbackDelegate getPhoneNumberChangedDelegate() {
        return this.mPhoneNumberChangedDelegate;
    }

    public Action getPrimaryAction() {
        return this.mPrimaryAction;
    }

    public TelephoneKeypadCallbackDelegate getTelephoneKeypadCallbackDelegate() {
        return this.mTelephoneKeypadCallbackDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mPhoneNumber, this.mPrimaryAction, Boolean.valueOf(this.mTelephoneKeypadCallbackDelegate == null), Boolean.valueOf(this.mPhoneNumberChangedDelegate == null), this.mKeySecondaryTexts);
    }

    public String toString() {
        return "TelephoneKeypadTemplate { header: " + this.mHeader + "; phone number: " + this.mPhoneNumber + "; primaryAction: " + this.mPrimaryAction + "; secondaryTextMap: " + this.mKeySecondaryTexts + " }";
    }

    public TelephoneKeypadTemplate() {
        this.mHeader = null;
        this.mPhoneNumber = null;
        this.mPrimaryAction = null;
        this.mTelephoneKeypadCallbackDelegate = null;
        this.mPhoneNumberChangedDelegate = null;
        this.mKeySecondaryTexts = new HashMap(0);
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private Header mHeader;
        private final Map<Integer, CarText> mKeySecondaryTexts;
        private String mPhoneNumber;
        private final InputCallbackDelegate mPhoneNumberChangedDelegate;
        private final Action mPrimaryAction;
        private TelephoneKeypadCallbackDelegate mTelephoneKeypadCallback;

        public Builder(TelephoneKeypadTemplate telephoneKeypadTemplate) {
            HashMap map = new HashMap(13);
            this.mKeySecondaryTexts = map;
            this.mHeader = telephoneKeypadTemplate.getHeader();
            this.mPhoneNumber = telephoneKeypadTemplate.getPhoneNumber();
            this.mPrimaryAction = telephoneKeypadTemplate.getPrimaryAction();
            this.mTelephoneKeypadCallback = telephoneKeypadTemplate.getTelephoneKeypadCallbackDelegate();
            this.mPhoneNumberChangedDelegate = (InputCallbackDelegate) Objects.requireNonNull(telephoneKeypadTemplate.mPhoneNumberChangedDelegate);
            map.putAll(telephoneKeypadTemplate.getKeySecondaryTexts());
        }

        public Builder addKeySecondaryText(int i2, CarText carText) {
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10 || i2 == 11) {
                CarTextConstraints.TEXT_AND_ICON.validateOrThrow(carText);
                this.mKeySecondaryTexts.put(Integer.valueOf(i2), carText);
                return this;
            }
            throw new IllegalArgumentException("Invalid key int \"" + i2 + "\"");
        }

        public TelephoneKeypadTemplate build() {
            Action startHeaderAction;
            Header header = this.mHeader;
            if (header != null && (startHeaderAction = header.getStartHeaderAction()) != null) {
                ActionsConstraints.ACTION_CONSTRAINTS_TELEPHONE_KEYPAD_HEADER.validateOrThrow(Collections.singletonList(startHeaderAction));
            }
            return new TelephoneKeypadTemplate(this);
        }

        public Builder setHeader(Header header) {
            this.mHeader = header;
            return this;
        }

        public Builder setKeySecondaryTexts(Map<Integer, CarText> map) {
            for (Map.Entry<Integer, CarText> entry : map.entrySet()) {
                addKeySecondaryText(entry.getKey().intValue(), entry.getValue());
            }
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.mPhoneNumber = str;
            return this;
        }

        public Builder setTelephoneKeypadCallback(TelephoneKeypadCallback telephoneKeypadCallback) {
            this.mTelephoneKeypadCallback = telephoneKeypadCallback == null ? null : TelephoneKeypadCallbackDelegateImpl.create(telephoneKeypadCallback);
            return this;
        }

        public Builder(Action action, final PhoneNumberChangeListener phoneNumberChangeListener) {
            this.mKeySecondaryTexts = new HashMap(13);
            ActionsConstraints.ACTION_CONSTRAINTS_TELEPHONE_KEYPAD_PRIMARY.validateOrThrow(Collections.singletonList(action));
            this.mPrimaryAction = action;
            this.mPhoneNumberChangedDelegate = InputCallbackDelegateImpl.create(new InputCallback() { // from class: androidx.car.app.dialer.TelephoneKeypadTemplate.Builder.1
                @Override // androidx.car.app.model.InputCallback
                public void onInputTextChanged(String str) {
                    phoneNumberChangeListener.onPhoneNumberChanged(str);
                }

                @Override // androidx.car.app.model.InputCallback
                public /* synthetic */ void onInputSubmitted(String str) {
                }
            });
        }
    }
}
