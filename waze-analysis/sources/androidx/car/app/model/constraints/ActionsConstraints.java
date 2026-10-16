package androidx.car.app.model.constraints;

import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ActionsConstraints {
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_BODY;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_BODY_WITH_PRIMARY_ACTION;
    private static final ActionsConstraints ACTIONS_CONSTRAINTS_CONSERVATIVE;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_CONVERSATION_ITEM;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_FAB;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_HEADER;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_MAP;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_MULTI_HEADER;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_NAVIGATION;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_ROW;
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_SIMPLE;

    @RequiresCarApi(6)
    public static final ActionsConstraints ACTIONS_CONSTRAINTS_TABS;
    public static final ActionsConstraints ACTION_CONSTRAINTS_BANNER_BELOW;
    public static final ActionsConstraints ACTION_CONSTRAINTS_BANNER_TRAILING;
    public static final ActionsConstraints ACTION_CONSTRAINTS_IN_CALL_CONTENT;
    public static final ActionsConstraints ACTION_CONSTRAINTS_IN_CALL_HEADER;
    public static final ActionsConstraints ACTION_CONSTRAINTS_TELEPHONE_KEYPAD_HEADER;
    public static final ActionsConstraints ACTION_CONSTRAINTS_TELEPHONE_KEYPAD_PRIMARY;
    private final Set<Integer> mAllowedActionTypes;
    private final Set<Integer> mDisallowedActionTypes;
    private final int mMaxActions;
    private final int mMaxCustomTitles;
    private final int mMaxPrimaryActions;
    private final boolean mOnClickListenerAllowed;
    private final boolean mRequireActionBackgroundColor;
    private final boolean mRequireActionIcons;
    private final Set<Integer> mRequiredActionTypes;
    private final boolean mRestrictBackgroundColorToPrimaryAction;
    private final CarTextConstraints mTitleTextConstraints;

    static {
        Builder builder = new Builder();
        builder.setMaxActions(1);
        builder.setRequireActionIcons(true);
        builder.setOnClickListenerAllowed(false);
        ActionsConstraints actionsConstraintsBuild = builder.build();
        ACTIONS_CONSTRAINTS_HEADER = actionsConstraintsBuild;
        Builder builder2 = new Builder();
        builder2.setMaxActions(2);
        builder2.setRequireActionIcons(true);
        builder2.setOnClickListenerAllowed(true);
        ACTIONS_CONSTRAINTS_MULTI_HEADER = builder2.build();
        Builder builder3 = new Builder();
        builder3.setTitleTextConstraints(CarTextConstraints.CONSERVATIVE);
        builder3.setMaxActions(2);
        ActionsConstraints actionsConstraintsBuild2 = builder3.build();
        ACTIONS_CONSTRAINTS_CONSERVATIVE = actionsConstraintsBuild2;
        Builder builder4 = new Builder(actionsConstraintsBuild2);
        builder4.setTitleTextConstraints(CarTextConstraints.COLOR_ONLY);
        builder4.setMaxCustomTitles(2);
        builder4.setOnClickListenerAllowed(true);
        ACTIONS_CONSTRAINTS_BODY = builder4.build();
        Builder builder5 = new Builder(actionsConstraintsBuild2);
        builder5.setTitleTextConstraints(CarTextConstraints.COLOR_ONLY);
        builder5.setMaxCustomTitles(2);
        builder5.setMaxPrimaryActions(1);
        builder5.setOnClickListenerAllowed(true);
        ACTIONS_CONSTRAINTS_BODY_WITH_PRIMARY_ACTION = builder5.build();
        Builder builder6 = new Builder(actionsConstraintsBuild2);
        builder6.setMaxCustomTitles(1);
        builder6.setTitleTextConstraints(CarTextConstraints.TEXT_ONLY);
        builder6.setOnClickListenerAllowed(true);
        builder6.setRestrictBackgroundColorToPrimaryAction(true);
        ACTIONS_CONSTRAINTS_SIMPLE = builder6.build();
        Builder builder7 = new Builder(actionsConstraintsBuild2);
        builder7.setMaxActions(4);
        builder7.setMaxCustomTitles(4);
        builder7.setMaxPrimaryActions(1);
        builder7.setTitleTextConstraints(CarTextConstraints.TEXT_AND_ICON);
        builder7.setOnClickListenerAllowed(true);
        builder7.setRestrictBackgroundColorToPrimaryAction(true);
        ACTIONS_CONSTRAINTS_NAVIGATION = builder7.build();
        Builder builder8 = new Builder(actionsConstraintsBuild2);
        builder8.setMaxActions(4);
        builder8.setMaxPrimaryActions(1);
        builder8.setOnClickListenerAllowed(true);
        builder8.setRestrictBackgroundColorToPrimaryAction(true);
        ACTIONS_CONSTRAINTS_MAP = builder8.build();
        Builder builder9 = new Builder();
        builder9.setMaxActions(2);
        builder9.setMaxCustomTitles(2);
        builder9.setMaxPrimaryActions(1);
        builder9.addAllowedActionType(1);
        builder9.addAllowedActionType(Action.TYPE_MEDIA_PLAYBACK);
        builder9.setOnClickListenerAllowed(true);
        ACTIONS_CONSTRAINTS_ROW = builder9.build();
        Builder builder10 = new Builder();
        builder10.setMaxActions(1);
        builder10.setMaxCustomTitles(1);
        builder10.addAllowedActionType(1);
        builder10.setRequireActionIcons(true);
        builder10.setOnClickListenerAllowed(true);
        ACTIONS_CONSTRAINTS_CONVERSATION_ITEM = builder10.build();
        Builder builder11 = new Builder();
        builder11.setMaxActions(2);
        builder11.addAllowedActionType(1);
        builder11.addAllowedActionType(Action.TYPE_COMPOSE_MESSAGE);
        builder11.addAllowedActionType(Action.TYPE_MEDIA_PLAYBACK);
        builder11.setRequireActionIcons(true);
        builder11.setRequireActionBackgroundColor(true);
        builder11.setOnClickListenerAllowed(true);
        ACTIONS_CONSTRAINTS_FAB = builder11.build();
        Builder builder12 = new Builder(actionsConstraintsBuild);
        builder12.addRequiredActionType(Action.TYPE_APP_ICON);
        ACTIONS_CONSTRAINTS_TABS = builder12.build();
        Builder builder13 = new Builder(actionsConstraintsBuild);
        builder13.addAllowedActionType(Action.TYPE_APP_ICON);
        builder13.addAllowedActionType(Action.TYPE_BACK);
        builder13.addAllowedActionType(1);
        ACTION_CONSTRAINTS_IN_CALL_HEADER = builder13.build();
        Builder builder14 = new Builder();
        builder14.addAllowedActionType(1);
        builder14.setRequireActionIcons(true);
        builder14.setMaxActions(5);
        builder14.setMaxCustomTitles(0);
        builder14.setMaxPrimaryActions(1);
        builder14.setOnClickListenerAllowed(true);
        ACTION_CONSTRAINTS_IN_CALL_CONTENT = builder14.build();
        Builder builder15 = new Builder(actionsConstraintsBuild);
        builder15.addAllowedActionType(Action.TYPE_APP_ICON);
        builder15.addAllowedActionType(Action.TYPE_BACK);
        ACTION_CONSTRAINTS_TELEPHONE_KEYPAD_HEADER = builder15.build();
        Builder builder16 = new Builder();
        builder16.setMaxActions(1);
        builder16.setOnClickListenerAllowed(true);
        builder16.setRequireActionIcons(true);
        builder16.addAllowedActionType(1);
        builder16.setMaxCustomTitles(0);
        ACTION_CONSTRAINTS_TELEPHONE_KEYPAD_PRIMARY = builder16.build();
        Builder builder17 = new Builder();
        builder17.setMaxActions(2);
        builder17.setMaxCustomTitles(2);
        builder17.setOnClickListenerAllowed(true);
        builder17.addAllowedActionType(1);
        ACTION_CONSTRAINTS_BANNER_TRAILING = builder17.build();
        Builder builder18 = new Builder();
        builder18.setMaxActions(3);
        builder18.setMaxCustomTitles(2);
        builder18.setOnClickListenerAllowed(true);
        builder18.addAllowedActionType(1);
        ACTION_CONSTRAINTS_BANNER_BELOW = builder18.build();
    }

    ActionsConstraints(Builder builder) {
        int i2 = builder.mMaxActions;
        this.mMaxActions = i2;
        this.mMaxPrimaryActions = builder.mMaxPrimaryActions;
        this.mMaxCustomTitles = builder.mMaxCustomTitles;
        this.mTitleTextConstraints = builder.mTitleTextConstraints;
        this.mRequireActionIcons = builder.mRequireActionIcons;
        this.mRequireActionBackgroundColor = builder.mRequireActionBackgroundColor;
        this.mOnClickListenerAllowed = builder.mOnClickListenerAllowed;
        this.mRestrictBackgroundColorToPrimaryAction = builder.mRestrictBackgroundColorToPrimaryAction;
        HashSet hashSet = new HashSet(builder.mRequiredActionTypes);
        this.mRequiredActionTypes = hashSet;
        HashSet hashSet2 = new HashSet(builder.mAllowedActionTypes);
        this.mAllowedActionTypes = hashSet2;
        HashSet hashSet3 = new HashSet(builder.mDisallowedActionTypes);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!builder.mDisallowedActionTypes.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.mDisallowedActionTypes = new HashSet(builder.mDisallowedActionTypes);
        if (hashSet.size() > i2) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public boolean areActionIconsRequired() {
        return this.mRequireActionIcons;
    }

    public Set<Integer> getAllowedActionTypes() {
        return this.mAllowedActionTypes;
    }

    public Set<Integer> getDisallowedActionTypes() {
        return this.mDisallowedActionTypes;
    }

    public int getMaxActions() {
        return this.mMaxActions;
    }

    public int getMaxCustomTitles() {
        return this.mMaxCustomTitles;
    }

    public int getMaxPrimaryActions() {
        return this.mMaxPrimaryActions;
    }

    public Set<Integer> getRequiredActionTypes() {
        return this.mRequiredActionTypes;
    }

    public CarTextConstraints getTitleTextConstraints() {
        return this.mTitleTextConstraints;
    }

    public boolean isActionBackgroundColorRequired() {
        return this.mRequireActionBackgroundColor;
    }

    public boolean isOnClickListenerAllowed() {
        return this.mOnClickListenerAllowed;
    }

    public boolean restrictBackgroundColorToPrimaryAction() {
        return this.mRestrictBackgroundColorToPrimaryAction;
    }

    public void validateOrThrow(List<Action> list) {
        Set hashSet = this.mRequiredActionTypes.isEmpty() ? Collections.EMPTY_SET : new HashSet(this.mRequiredActionTypes);
        int i2 = this.mMaxCustomTitles;
        int i3 = this.mMaxPrimaryActions;
        int i4 = this.mMaxActions;
        for (Action action : list) {
            if (!this.mDisallowedActionTypes.isEmpty() && this.mDisallowedActionTypes.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            if (!this.mAllowedActionTypes.isEmpty() && !this.mAllowedActionTypes.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i2--;
                if (i2 < 0) {
                    throw new IllegalArgumentException("Action list exceeded max number of " + this.mMaxCustomTitles + " actions with custom titles");
                }
                this.mTitleTextConstraints.validateOrThrow(title);
            }
            i4--;
            if (i4 < 0) {
                throw new IllegalArgumentException("Action list exceeded max number of " + this.mMaxActions + " actions");
            }
            if ((action.getFlags() & 1) != 0 && i3 - 1 < 0) {
                throw new IllegalArgumentException("Action list exceeded max number of " + this.mMaxPrimaryActions + " primary actions");
            }
            if (this.mRequireActionIcons && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.mRequireActionBackgroundColor && ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard())) {
                throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
            }
            if (!this.mRequireActionBackgroundColor && !CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.mRestrictBackgroundColorToPrimaryAction && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.mOnClickListenerAllowed && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            sb.append(Action.typeToString(((Integer) it.next()).intValue()));
            sb.append(",");
        }
        sb.toString();
        throw new IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }

    /* compiled from: WazeSource */
    public final class Builder {
        final Set<Integer> mAllowedActionTypes;
        final Set<Integer> mDisallowedActionTypes;
        int mMaxActions;
        int mMaxCustomTitles;
        int mMaxPrimaryActions;
        boolean mOnClickListenerAllowed;
        boolean mRequireActionBackgroundColor;
        boolean mRequireActionIcons;
        final Set<Integer> mRequiredActionTypes;
        boolean mRestrictBackgroundColorToPrimaryAction;
        CarTextConstraints mTitleTextConstraints;

        public Builder(ActionsConstraints actionsConstraints) {
            HashSet hashSet = new HashSet();
            this.mRequiredActionTypes = hashSet;
            HashSet hashSet2 = new HashSet();
            this.mDisallowedActionTypes = hashSet2;
            HashSet hashSet3 = new HashSet();
            this.mAllowedActionTypes = hashSet3;
            this.mMaxActions = Integer.MAX_VALUE;
            this.mMaxPrimaryActions = 0;
            this.mRestrictBackgroundColorToPrimaryAction = false;
            this.mTitleTextConstraints = CarTextConstraints.UNCONSTRAINED;
            Objects.requireNonNull(actionsConstraints);
            this.mMaxActions = actionsConstraints.getMaxActions();
            this.mMaxPrimaryActions = actionsConstraints.getMaxPrimaryActions();
            this.mMaxCustomTitles = actionsConstraints.getMaxCustomTitles();
            this.mTitleTextConstraints = actionsConstraints.getTitleTextConstraints();
            hashSet.addAll(actionsConstraints.getRequiredActionTypes());
            hashSet2.addAll(actionsConstraints.getDisallowedActionTypes());
            hashSet3.addAll(actionsConstraints.getAllowedActionTypes());
            this.mRequireActionIcons = actionsConstraints.areActionIconsRequired();
            this.mRequireActionBackgroundColor = actionsConstraints.isActionBackgroundColorRequired();
            this.mOnClickListenerAllowed = actionsConstraints.isOnClickListenerAllowed();
            this.mRestrictBackgroundColorToPrimaryAction = actionsConstraints.restrictBackgroundColorToPrimaryAction();
        }

        public Builder addAllowedActionType(int i2) {
            this.mAllowedActionTypes.add(Integer.valueOf(i2));
            return this;
        }

        public Builder addDisallowedActionType(int i2) {
            this.mDisallowedActionTypes.add(Integer.valueOf(i2));
            return this;
        }

        public Builder addRequiredActionType(int i2) {
            this.mRequiredActionTypes.add(Integer.valueOf(i2));
            return this;
        }

        public ActionsConstraints build() {
            return new ActionsConstraints(this);
        }

        public Builder setMaxActions(int i2) {
            this.mMaxActions = i2;
            return this;
        }

        public Builder setMaxCustomTitles(int i2) {
            this.mMaxCustomTitles = i2;
            return this;
        }

        public Builder setMaxPrimaryActions(int i2) {
            this.mMaxPrimaryActions = i2;
            return this;
        }

        public Builder setOnClickListenerAllowed(boolean z) {
            this.mOnClickListenerAllowed = z;
            return this;
        }

        public Builder setRequireActionBackgroundColor(boolean z) {
            this.mRequireActionBackgroundColor = z;
            return this;
        }

        public Builder setRequireActionIcons(boolean z) {
            this.mRequireActionIcons = z;
            return this;
        }

        public Builder setRestrictBackgroundColorToPrimaryAction(boolean z) {
            this.mRestrictBackgroundColorToPrimaryAction = z;
            return this;
        }

        public Builder setTitleTextConstraints(CarTextConstraints carTextConstraints) {
            this.mTitleTextConstraints = carTextConstraints;
            return this;
        }

        public Builder() {
            this.mRequiredActionTypes = new HashSet();
            this.mDisallowedActionTypes = new HashSet();
            this.mAllowedActionTypes = new HashSet();
            this.mMaxActions = Integer.MAX_VALUE;
            this.mMaxPrimaryActions = 0;
            this.mRestrictBackgroundColorToPrimaryAction = false;
            this.mTitleTextConstraints = CarTextConstraints.UNCONSTRAINED;
        }
    }
}
