package androidx.car.app.model.signin;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.OnClickDelegate;
import androidx.car.app.model.Template;
import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.CarTextConstraints;
import androidx.car.app.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(2)
/* loaded from: classes.dex */
public final class SignInTemplate implements Template {
    private final List<Action> mActionList;
    private final ActionStrip mActionStrip;
    private final CarText mAdditionalText;
    private final Action mHeaderAction;
    private final CarText mInstructions;
    private final boolean mIsLoading;
    private final SignInMethod mSignInMethod;
    private final CarText mTitle;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    @RequiresCarApi(2)
    public static final class Builder {
        List<Action> mActionList = new ArrayList();
        ActionStrip mActionStrip;
        CarText mAdditionalText;
        Action mHeaderAction;
        CarText mInstructions;
        boolean mIsLoading;
        final SignInMethod mSignInMethod;
        CarText mTitle;

        public Builder(SignInMethod signInMethod) {
            Objects.requireNonNull(signInMethod);
            this.mSignInMethod = signInMethod;
        }

        public Builder addAction(Action action) {
            Objects.requireNonNull(action);
            OnClickDelegate onClickDelegate = action.getOnClickDelegate();
            Objects.requireNonNull(onClickDelegate);
            if (!onClickDelegate.isParkedOnly()) {
                throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
            }
            this.mActionList.add(action);
            ActionsConstraints.ACTIONS_CONSTRAINTS_BODY.validateOrThrow(this.mActionList);
            return this;
        }

        public SignInTemplate build() {
            return new SignInTemplate(this);
        }

        public Builder setActionStrip(ActionStrip actionStrip) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_SIMPLE;
            Objects.requireNonNull(actionStrip);
            actionsConstraints.validateOrThrow(actionStrip.getActions());
            this.mActionStrip = actionStrip;
            return this;
        }

        public Builder setAdditionalText(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mAdditionalText = carTextCreate;
            CarTextConstraints.CLICKABLE_TEXT_ONLY.validateOrThrow(carTextCreate);
            return this;
        }

        public Builder setHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_HEADER;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setInstructions(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mInstructions = carTextCreate;
            CarTextConstraints.TEXT_WITH_COLORS.validateOrThrow(carTextCreate);
            return this;
        }

        public Builder setLoading(boolean z) {
            this.mIsLoading = z;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            CarText carTextCreate = CarText.create(charSequence);
            this.mTitle = carTextCreate;
            CarTextConstraints.TEXT_ONLY.validateOrThrow(carTextCreate);
            return this;
        }
    }

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public interface SignInMethod {
    }

    public SignInTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mHeaderAction = builder.mHeaderAction;
        this.mTitle = builder.mTitle;
        this.mInstructions = builder.mInstructions;
        this.mAdditionalText = builder.mAdditionalText;
        this.mActionStrip = builder.mActionStrip;
        this.mActionList = CollectionUtils.unmodifiableCopy(builder.mActionList);
        this.mSignInMethod = builder.mSignInMethod;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && Objects.equals(this.mTitle, signInTemplate.mTitle) && Objects.equals(this.mInstructions, signInTemplate.mInstructions) && Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && Objects.equals(this.mActionList, signInTemplate.mActionList) && Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return CollectionUtils.emptyIfNull(this.mActionList);
    }

    public CarText getAdditionalText() {
        return this.mAdditionalText;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public CarText getInstructions() {
        return this.mInstructions;
    }

    public SignInMethod getSignInMethod() {
        SignInMethod signInMethod = this.mSignInMethod;
        Objects.requireNonNull(signInMethod);
        return signInMethod;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTitle, this.mInstructions, this.mAdditionalText, this.mActionStrip, this.mActionList, this.mSignInMethod);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SignInTemplate";
    }

    private SignInTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTitle = null;
        this.mInstructions = null;
        this.mAdditionalText = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mSignInMethod = null;
    }
}
