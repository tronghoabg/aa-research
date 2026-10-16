package androidx.core.app;

import a.a$$ExternalSyntheticApiModelOutline0;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0;
import android.text.Annotation;
import android.text.ParcelableSpan;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.annotation.ReplaceWith;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.util.Preconditions;
import com.bumptech.glide.load.n$$ExternalSyntheticApiModelOutline0;
import com.waze.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.TimeConversions;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class NotificationCompat {
    private static final String ANNOTATION_SEMANTIC_STYLE_KEY = "android.app.notification.semanticStyle";
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_VOICEMAIL = "voicemail";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    private static final String EXTRA_MESSAGING_PERSON = "android.messagingUser";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PREFER_SMALL_ICON = "android.app.preferSmallIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int SEMANTIC_STYLE_CAUTION = 3;
    public static final int SEMANTIC_STYLE_DANGER = 4;
    public static final int SEMANTIC_STYLE_INFO = 1;
    public static final int SEMANTIC_STYLE_SAFE = 2;
    public static final int SEMANTIC_STYLE_UNSPECIFIED = 0;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    /* compiled from: WazeSource */
    class Api24Impl {
        private Api24Impl() {
        }

        static boolean getAllowGeneratedReplies(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* compiled from: WazeSource */
    class Api26Impl {
        private Api26Impl() {
        }

        static int getBadgeIconType(Notification notification) {
            return notification.getBadgeIconType();
        }

        static String getChannelId(Notification notification) {
            return notification.getChannelId();
        }

        static int getGroupAlertBehavior(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence getSettingsText(Notification notification) {
            return notification.getSettingsText();
        }

        static String getShortcutId(Notification notification) {
            return notification.getShortcutId();
        }

        static long getTimeoutAfter(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* compiled from: WazeSource */
    class Api28Impl {
        private Api28Impl() {
        }

        static int getSemanticAction(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static Notification.BubbleMetadata getBubbleMetadata(Notification notification) {
            return notification.getBubbleMetadata();
        }

        static int getEditChoicesBeforeSending(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static LocusId getLocusId(Notification notification) {
            return notification.getLocusId();
        }

        static boolean isContextual(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* compiled from: WazeSource */
    class Api36Impl {
        private Api36Impl() {
        }

        static boolean hasPromotableCharacteristics(Notification notification) {
            return notification.hasPromotableCharacteristics();
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    /* compiled from: WazeSource */
    public class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* compiled from: WazeSource */
        class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Style createDecoratedCustomViewStyle() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews createRemoteViews(RemoteViews remoteViews, boolean z) throws Resources.NotFoundException {
            int iMin;
            int i2 = 0;
            RemoteViews remoteViewsApplyStandardTemplate = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            remoteViewsApplyStandardTemplate.removeAllViews(R.id.actions);
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (!z || nonContextualActions == null || (iMin = Math.min(nonContextualActions.size(), 3)) <= 0) {
                i2 = 8;
            } else {
                for (int i3 = 0; i3 < iMin; i3++) {
                    remoteViewsApplyStandardTemplate.addView(R.id.actions, generateActionButton(nonContextualActions.get(i3)));
                }
            }
            remoteViewsApplyStandardTemplate.setViewVisibility(R.id.actions, i2);
            remoteViewsApplyStandardTemplate.setViewVisibility(R.id.action_divider, i2);
            buildIntoRemoteViews(remoteViewsApplyStandardTemplate, remoteViews);
            return remoteViewsApplyStandardTemplate;
        }

        private RemoteViews generateActionButton(Action action) {
            PendingIntent pendingIntent = action.actionIntent;
            String packageName = this.mBuilder.mContext.getPackageName();
            boolean z = pendingIntent == null;
            RemoteViews remoteViews = new RemoteViews(packageName, z ? R.layout.notification_action_tombstone : R.layout.notification_action);
            IconCompat iconCompat = action.getIconCompat();
            if (iconCompat != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, createColoredBitmap(iconCompat, R.color.notification_action_color_filter));
            }
            remoteViews.setTextViewText(R.id.action_text, action.title);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
            }
            remoteViews.setContentDescription(R.id.action_container, action.title);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Action action : list) {
                if (!action.isContextual()) {
                    arrayList.add(action);
                }
            }
            return arrayList;
        }

        public static List<CharSequence> getTextsFromContentView(Context context, Notification notification) throws PackageManager.NameNotFoundException {
            if (!a$$ExternalSyntheticApiModelOutline0.m$1().getName().equals(notification.extras.getString(NotificationCompat.EXTRA_TEMPLATE))) {
                return Collections.EMPTY_LIST;
            }
            if (notification.contentView == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews = notification.bigContentView != null ? notification.bigContentView : notification.contentView != null ? notification.contentView : notification.headsUpContentView;
            String str = remoteViews.getPackage();
            try {
                Context contextCreatePackageContext = context.createPackageContext(str, 0);
                contextCreatePackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                View viewApply = remoteViews.apply(contextCreatePackageContext, null);
                ArrayList arrayList = new ArrayList();
                getTextsFromViewTraversal(viewApply, arrayList);
                return arrayList;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        private static void getTextsFromViewTraversal(View view, ArrayList<CharSequence> arrayList) {
            CharSequence text;
            if (!(view instanceof ViewGroup)) {
                return;
            }
            int i2 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i2 >= viewGroup.getChildCount()) {
                    return;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof TextView) && (text = ((TextView) childAt).getText()) != null && text.length() > 0) {
                    arrayList.add(text);
                }
                if (childAt instanceof ViewGroup) {
                    getTextsFromViewTraversal(childAt, arrayList);
                }
                i2++;
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(Api24Impl.createDecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public interface Extender {
        Builder extend(Builder builder);
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    /* compiled from: WazeSource */
    public final class MetricStyle extends Style {
        private static final int CRITICAL_METRIC_DEFAULT = 0;
        private static final String EXTRA_METRICS = "android.metrics";
        private static final String EXTRA_METRICS_CRITICAL_INDEX = "android.metrics.criticalIndex";
        public static final int METRIC_INDEX_NONE = -1;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MetricStyle";
        private final List<Metric> mMetrics = new ArrayList();
        private int mCriticalMetric = 0;

        /* compiled from: WazeSource */
        final class Api37Impl {
            private Api37Impl() {
            }

            private static Notification.Metric toPlatformMetric(Metric metric) {
                return new Notification.Metric(toPlatformMetricValue(metric.getValue()), metric.getLabel(), metric.getSemanticStyle());
            }

            private static Notification.Metric.MetricValue toPlatformMetricValue(Metric.MetricValue metricValue) {
                Notification.Metric.TimeDifference timeDifferenceForPausedTimer;
                if (metricValue instanceof Metric.TimeDifference) {
                    Metric.TimeDifference timeDifference = (Metric.TimeDifference) metricValue;
                    if (timeDifference.getZeroTime() != null) {
                        timeDifferenceForPausedTimer = timeDifference.isTimer() ? Notification.Metric.TimeDifference.forTimer(TimeConversions.convert(timeDifference.getZeroTime()), timeDifference.getFormat()) : Notification.Metric.TimeDifference.forStopwatch(TimeConversions.convert(timeDifference.getZeroTime()), timeDifference.getFormat());
                    } else if (timeDifference.getZeroElapsedRealtime() != null) {
                        timeDifferenceForPausedTimer = timeDifference.isTimer() ? Notification.Metric.TimeDifference.forTimer(timeDifference.getZeroElapsedRealtime().longValue(), timeDifference.getFormat()) : Notification.Metric.TimeDifference.forStopwatch(timeDifference.getZeroElapsedRealtime().longValue(), timeDifference.getFormat());
                    } else {
                        if (timeDifference.getPausedDuration() == null) {
                            Objects.toString(timeDifference);
                            throw new IllegalArgumentException("Unexpected TimeDifference: ".concat(String.valueOf(timeDifference)));
                        }
                        timeDifferenceForPausedTimer = timeDifference.isTimer() ? Notification.Metric.TimeDifference.forPausedTimer(TimeConversions.convert(timeDifference.getPausedDuration()), timeDifference.getFormat()) : Notification.Metric.TimeDifference.forPausedStopwatch(TimeConversions.convert(timeDifference.getPausedDuration()), timeDifference.getFormat());
                    }
                    return (Notification.Metric.MetricValue) timeDifferenceForPausedTimer;
                }
                if (metricValue instanceof Metric.FixedDate) {
                    Metric.FixedDate fixedDate = (Metric.FixedDate) metricValue;
                    return new Notification.Metric.FixedDate(TimeConversions.convert(fixedDate.getValue()), fixedDate.getFormat());
                }
                if (metricValue instanceof Metric.FixedFloat) {
                    Metric.FixedFloat fixedFloat = (Metric.FixedFloat) metricValue;
                    return new Notification.Metric.FixedFloat(fixedFloat.getValue(), fixedFloat.getUnit(), fixedFloat.getMinFractionDigits(), fixedFloat.getMaxFractionDigits());
                }
                if (metricValue instanceof Metric.FixedInt) {
                    Metric.FixedInt fixedInt = (Metric.FixedInt) metricValue;
                    return new Notification.Metric.FixedInt(fixedInt.getValue(), fixedInt.getUnit());
                }
                if (metricValue instanceof Metric.FixedText) {
                    Metric.FixedText fixedText = (Metric.FixedText) metricValue;
                    return new Notification.Metric.FixedText(fixedText.getValue(), fixedText.getUnit());
                }
                if (metricValue instanceof Metric.FixedTime) {
                    return new Notification.Metric.FixedTime(TimeConversions.convert(((Metric.FixedTime) metricValue).getValue()));
                }
                Objects.toString(metricValue);
                throw new IllegalArgumentException("Unexpected MetricValue: ".concat(String.valueOf(metricValue)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Notification.Style toPlatformStyle(MetricStyle metricStyle) {
                Notification.Style metricStyle2 = new Notification.MetricStyle();
                Iterator<Metric> it = metricStyle.getMetrics().iterator();
                while (it.hasNext()) {
                    metricStyle2.addMetric(toPlatformMetric(it.next()));
                }
                metricStyle2.setCriticalMetric(metricStyle.getMetrics().indexOf(metricStyle.getCriticalMetric()));
                return metricStyle2;
            }
        }

        private void validate() {
            if (this.mMetrics.isEmpty()) {
                throw new IllegalArgumentException("A MetricStyle must have at least one Metric");
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            if (Build.VERSION.SDK_INT >= 37) {
                return;
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<Metric> it = this.mMetrics.iterator();
            while (it.hasNext()) {
                arrayList.add(Metric.toBundle(it.next()));
            }
            bundle.putParcelableArrayList(EXTRA_METRICS, arrayList);
            bundle.putInt(EXTRA_METRICS_CRITICAL_INDEX, this.mCriticalMetric);
        }

        public MetricStyle addMetric(Metric metric) {
            this.mMetrics.add((Metric) j$.util.Objects.requireNonNull(metric));
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            validate();
            if (Build.VERSION.SDK_INT >= 37) {
                notificationBuilderWithBuilderAccessor.getBuilder().setStyle(Api37Impl.toPlatformStyle(this));
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(EXTRA_METRICS);
            bundle.remove(EXTRA_METRICS_CRITICAL_INDEX);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MetricStyle)) {
                return false;
            }
            MetricStyle metricStyle = (MetricStyle) obj;
            if (this == metricStyle) {
                return true;
            }
            return j$.util.Objects.equals(this.mMetrics, metricStyle.mMetrics) && this.mCriticalMetric == metricStyle.mCriticalMetric;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public Metric getCriticalMetric() {
            int i2 = this.mCriticalMetric;
            if (i2 < 0 || i2 >= this.mMetrics.size()) {
                return null;
            }
            return this.mMetrics.get(this.mCriticalMetric);
        }

        public List<Metric> getMetrics() {
            return DesugarCollections.unmodifiableList(this.mMetrics);
        }

        public int hashCode() {
            return j$.util.Objects.hash(this.mMetrics, Integer.valueOf(this.mCriticalMetric));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            Metric metricFromBundle;
            super.restoreFromCompatExtras(bundle);
            this.mMetrics.clear();
            ArrayList parcelableArrayList = androidx.core.os.BundleCompat.getParcelableArrayList(bundle, EXTRA_METRICS, Bundle.class);
            if (parcelableArrayList != null) {
                int size = parcelableArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                    if (bundle2 != null && (metricFromBundle = Metric.fromBundle(bundle2)) != null) {
                        addMetric(metricFromBundle);
                    }
                }
            }
            this.mCriticalMetric = bundle.getInt(EXTRA_METRICS_CRITICAL_INDEX, 0);
        }

        public MetricStyle setCriticalMetric(int i2) {
            this.mCriticalMetric = i2;
            return this;
        }

        public MetricStyle setMetrics(List<Metric> list) {
            this.mMetrics.clear();
            Iterator<Metric> it = list.iterator();
            while (it.hasNext()) {
                this.mMetrics.add((Metric) j$.util.Objects.requireNonNull(it.next()));
            }
            return this;
        }

        public String toString() {
            return "MetricStyle{mMetrics=" + this.mMetrics + ", mCriticalMetric=" + this.mCriticalMetric + "}";
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    /* compiled from: WazeSource */
    public class ProgressStyle extends Style {
        private static final int DEFAULT_PROGRESS_MAX = 100;
        private static final String KEY_ELEMENT_COLOR = "colorInt";
        private static final String KEY_ELEMENT_ID = "id";
        private static final String KEY_ELEMENT_SEMANTIC_STYLE = "semanticStyle";
        private static final String KEY_POINT_POSITION = "position";
        private static final String KEY_SEGMENT_LENGTH = "length";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$ProgressStyle";
        private IconCompat mEndIcon;
        private boolean mIndeterminate;
        private IconCompat mStartIcon;
        private IconCompat mTrackerIcon;
        private List<Segment> mProgressSegments = new ArrayList();
        private List<Point> mProgressPoints = new ArrayList();
        private int mProgress = 0;
        private boolean mIsStyledByProgress = true;

        /* compiled from: WazeSource */
        final class Api36Impl {
            private Api36Impl() {
            }

            static void setProgress(Notification.ProgressStyle progressStyle, int i2) {
                progressStyle.setProgress(i2);
            }

            static void setProgressEndIcon(Notification.ProgressStyle progressStyle, Icon icon) {
                progressStyle.setProgressEndIcon(icon);
            }

            static void setProgressIndeterminate(Notification.ProgressStyle progressStyle, boolean z) {
                progressStyle.setProgressIndeterminate(z);
            }

            static void setProgressPoints(Notification.ProgressStyle progressStyle, List<Point> list) {
                Iterator<Point> it = list.iterator();
                while (it.hasNext()) {
                    progressStyle.addProgressPoint(toPlatformPoint(it.next()));
                }
            }

            static void setProgressSegments(Notification.ProgressStyle progressStyle, List<Segment> list) {
                Iterator<Segment> it = list.iterator();
                while (it.hasNext()) {
                    progressStyle.addProgressSegment(toPlatformSegment(it.next()));
                }
            }

            static void setProgressStartIcon(Notification.ProgressStyle progressStyle, Icon icon) {
                progressStyle.setProgressStartIcon(icon);
            }

            static void setProgressTrackerIcon(Notification.ProgressStyle progressStyle, Icon icon) {
                progressStyle.setProgressTrackerIcon(icon);
            }

            static void setStyledByProgress(Notification.ProgressStyle progressStyle, boolean z) {
                progressStyle.setStyledByProgress(z);
            }

            static Notification.ProgressStyle.Point toPlatformPoint(Point point) {
                return new Notification.ProgressStyle.Point(point.getPosition()).setColor(point.getColor()).setId(point.getId());
            }

            static Notification.ProgressStyle.Segment toPlatformSegment(Segment segment) {
                return new Notification.ProgressStyle.Segment(segment.getLength()).setColor(segment.getColor()).setId(segment.getId());
            }
        }

        /* compiled from: WazeSource */
        final class Api37Impl {
            private Api37Impl() {
            }

            static void setProgressPoints(Notification.ProgressStyle progressStyle, List<Point> list) {
                Iterator<Point> it = list.iterator();
                while (it.hasNext()) {
                    progressStyle.addProgressPoint(toPlatformPoint(it.next()));
                }
            }

            static void setProgressSegments(Notification.ProgressStyle progressStyle, List<Segment> list) {
                Iterator<Segment> it = list.iterator();
                while (it.hasNext()) {
                    progressStyle.addProgressSegment(toPlatformSegment(it.next()));
                }
            }

            static Notification.ProgressStyle.Point toPlatformPoint(Point point) {
                return Api36Impl.toPlatformPoint(point).setSemanticStyle(point.getSemanticStyle());
            }

            static Notification.ProgressStyle.Segment toPlatformSegment(Segment segment) {
                return Api36Impl.toPlatformSegment(segment).setSemanticStyle(segment.getSemanticStyle());
            }
        }

        /* compiled from: WazeSource */
        public final class Point {
            private int mPosition;
            private int mId = 0;
            private int mColor = 0;
            private int mSemanticStyle = 0;

            public Point(int i2) {
                this.mPosition = i2;
            }

            public int getColor() {
                return this.mColor;
            }

            public int getId() {
                return this.mId;
            }

            public int getPosition() {
                return this.mPosition;
            }

            public int getSemanticStyle() {
                return this.mSemanticStyle;
            }

            public Point setColor(int i2) {
                this.mColor = i2;
                return this;
            }

            public Point setId(int i2) {
                this.mId = i2;
                return this;
            }

            public Point setSemanticStyle(int i2) {
                this.mSemanticStyle = i2;
                return this;
            }
        }

        /* compiled from: WazeSource */
        public final class Segment {
            private int mLength;
            private int mId = 0;
            private int mColor = 0;
            private int mSemanticStyle = 0;

            public Segment(int i2) {
                this.mLength = i2;
            }

            public int getColor() {
                return this.mColor;
            }

            public int getId() {
                return this.mId;
            }

            public int getLength() {
                return this.mLength;
            }

            public int getSemanticStyle() {
                return this.mSemanticStyle;
            }

            public Segment setColor(int i2) {
                this.mColor = i2;
                return this;
            }

            public Segment setId(int i2) {
                this.mId = i2;
                return this;
            }

            public Segment setSemanticStyle(int i2) {
                this.mSemanticStyle = i2;
                return this;
            }
        }

        private static IconCompat asIconCompat(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        private static ArrayList<Bundle> getProgressPointsAsBundleList(List<Point> list) {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Point point = list.get(i2);
                    if (point.getPosition() >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putInt(KEY_POINT_POSITION, point.getPosition());
                        bundle.putInt("id", point.getId());
                        bundle.putInt(KEY_ELEMENT_COLOR, point.getColor());
                        bundle.putInt(KEY_ELEMENT_SEMANTIC_STYLE, point.getSemanticStyle());
                        arrayList.add(bundle);
                    }
                }
            }
            return arrayList;
        }

        private static List<Point> getProgressPointsFromBundleList(List<Bundle> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Bundle bundle = list.get(i2);
                    int i3 = bundle.getInt(KEY_POINT_POSITION);
                    if (i3 >= 0) {
                        int i4 = bundle.getInt("id");
                        int i5 = bundle.getInt(KEY_ELEMENT_COLOR, 0);
                        int i6 = bundle.getInt(KEY_ELEMENT_SEMANTIC_STYLE, 0);
                        Point point = new Point(i3);
                        point.setId(i4);
                        point.setColor(i5);
                        point.setSemanticStyle(i6);
                        arrayList.add(point);
                    }
                }
            }
            return arrayList;
        }

        private static ArrayList<Bundle> getProgressSegmentsAsBundleList(List<Segment> list) {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Segment segment = list.get(i2);
                    if (segment.getLength() > 0) {
                        Bundle bundle = new Bundle();
                        bundle.putInt(KEY_SEGMENT_LENGTH, segment.getLength());
                        bundle.putInt("id", segment.getId());
                        bundle.putInt(KEY_ELEMENT_COLOR, segment.getColor());
                        bundle.putInt(KEY_ELEMENT_SEMANTIC_STYLE, segment.getSemanticStyle());
                        arrayList.add(bundle);
                    }
                }
            }
            return arrayList;
        }

        private static List<Segment> getProgressSegmentsFromBundleList(List<Bundle> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Bundle bundle = list.get(i2);
                    int i3 = bundle.getInt(KEY_SEGMENT_LENGTH);
                    if (i3 > 0) {
                        int i4 = bundle.getInt("id");
                        int i5 = bundle.getInt(KEY_ELEMENT_COLOR, 0);
                        int i6 = bundle.getInt(KEY_ELEMENT_SEMANTIC_STYLE, 0);
                        Segment segment = new Segment(i3);
                        segment.setId(i4);
                        segment.setColor(i5);
                        segment.setSemanticStyle(i6);
                        arrayList.add(segment);
                    }
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            if (Build.VERSION.SDK_INT <= 36) {
                bundle.putParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_SEGMENTS, getProgressSegmentsAsBundleList(this.mProgressSegments));
                bundle.putParcelableArrayList(NotificationCompat.EXTRA_PROGRESS_POINTS, getProgressPointsAsBundleList(this.mProgressPoints));
            }
            if (Build.VERSION.SDK_INT < 36) {
                bundle.putInt(NotificationCompat.EXTRA_PROGRESS, this.mProgress);
                bundle.putBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, this.mIndeterminate);
                bundle.putInt(NotificationCompat.EXTRA_PROGRESS_MAX, getProgressMax());
                bundle.putBoolean(NotificationCompat.EXTRA_STYLED_BY_PROGRESS, this.mIsStyledByProgress);
                Builder builder = this.mBuilder;
                Context context = builder != null ? builder.mContext : null;
                if (context == null) {
                    return;
                }
                IconCompat iconCompat = this.mTrackerIcon;
                if (iconCompat != null) {
                    bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, iconCompat.toIcon(context));
                } else {
                    bundle.remove(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
                }
                IconCompat iconCompat2 = this.mStartIcon;
                if (iconCompat2 != null) {
                    bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_START_ICON, iconCompat2.toIcon(context));
                } else {
                    bundle.remove(NotificationCompat.EXTRA_PROGRESS_START_ICON);
                }
                IconCompat iconCompat3 = this.mEndIcon;
                if (iconCompat3 != null) {
                    bundle.putParcelable(NotificationCompat.EXTRA_PROGRESS_END_ICON, iconCompat3.toIcon(context));
                } else {
                    bundle.remove(NotificationCompat.EXTRA_PROGRESS_END_ICON);
                }
            }
        }

        public ProgressStyle addProgressPoint(Point point) {
            if (this.mProgressPoints == null) {
                this.mProgressPoints = new ArrayList();
            }
            if (point.getPosition() > 0) {
                this.mProgressPoints.add(point);
            }
            return this;
        }

        public ProgressStyle addProgressSegment(Segment segment) {
            if (this.mProgressSegments == null) {
                this.mProgressSegments = new ArrayList();
            }
            if (segment.getLength() > 0) {
                this.mProgressSegments.add(segment);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
            if (Build.VERSION.SDK_INT < 36) {
                int progressMax = getProgressMax();
                builder.setProgress(progressMax, Math.min(this.mProgress, progressMax), this.mIndeterminate);
                return;
            }
            Context context = notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null;
            Notification.ProgressStyle progressStyle = new Notification.ProgressStyle();
            Api36Impl.setStyledByProgress(progressStyle, this.mIsStyledByProgress);
            Api36Impl.setProgress(progressStyle, this.mProgress);
            Api36Impl.setProgressIndeterminate(progressStyle, this.mIndeterminate);
            IconCompat iconCompat = this.mStartIcon;
            Api36Impl.setProgressStartIcon(progressStyle, iconCompat != null ? iconCompat.toIcon(context) : null);
            IconCompat iconCompat2 = this.mEndIcon;
            Api36Impl.setProgressEndIcon(progressStyle, iconCompat2 != null ? iconCompat2.toIcon(context) : null);
            IconCompat iconCompat3 = this.mTrackerIcon;
            Api36Impl.setProgressTrackerIcon(progressStyle, iconCompat3 != null ? iconCompat3.toIcon(context) : null);
            int i2 = Build.VERSION.SDK_INT;
            List<Point> list = this.mProgressPoints;
            if (i2 >= 37) {
                Api37Impl.setProgressPoints(progressStyle, list);
                Api37Impl.setProgressSegments(progressStyle, this.mProgressSegments);
            } else {
                Api36Impl.setProgressPoints(progressStyle, list);
                Api36Impl.setProgressSegments(progressStyle, this.mProgressSegments);
            }
            builder.setStyle(progressStyle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_SEGMENTS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_STYLED_BY_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_START_ICON);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_END_ICON);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_POINTS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public int getProgress() {
            return this.mProgress;
        }

        public IconCompat getProgressEndIcon() {
            return this.mEndIcon;
        }

        public int getProgressMax() {
            List<Segment> list = this.mProgressSegments;
            if (list == null || list.isEmpty()) {
                return 100;
            }
            int i2 = 0;
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int length = list.get(i3).getLength();
                if (length > 0) {
                    try {
                        iM = NotificationCompat$ProgressStyle$$ExternalSyntheticBackport0.m(iM, length);
                        i2++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i2 == 0) {
                return 100;
            }
            return iM;
        }

        public List<Point> getProgressPoints() {
            return this.mProgressPoints;
        }

        public List<Segment> getProgressSegments() {
            return this.mProgressSegments;
        }

        public IconCompat getProgressStartIcon() {
            return this.mStartIcon;
        }

        public IconCompat getProgressTrackerIcon() {
            return this.mTrackerIcon;
        }

        public boolean isProgressIndeterminate() {
            return this.mIndeterminate;
        }

        public boolean isStyledByProgress() {
            return this.mIsStyledByProgress;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mProgressSegments = getProgressSegmentsFromBundleList(androidx.core.os.BundleCompat.getParcelableArrayList(bundle, NotificationCompat.EXTRA_PROGRESS_SEGMENTS, Bundle.class));
            this.mProgress = bundle.getInt(NotificationCompat.EXTRA_PROGRESS, 0);
            this.mIndeterminate = bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, false);
            this.mIsStyledByProgress = bundle.getBoolean(NotificationCompat.EXTRA_STYLED_BY_PROGRESS, true);
            this.mProgressPoints = getProgressPointsFromBundleList(androidx.core.os.BundleCompat.getParcelableArrayList(bundle, NotificationCompat.EXTRA_PROGRESS_POINTS, Bundle.class));
            this.mTrackerIcon = asIconCompat((Parcelable) androidx.core.os.BundleCompat.getParcelable(bundle, NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, Icon.class));
            this.mStartIcon = asIconCompat((Parcelable) androidx.core.os.BundleCompat.getParcelable(bundle, NotificationCompat.EXTRA_PROGRESS_START_ICON, Icon.class));
            this.mEndIcon = asIconCompat((Parcelable) androidx.core.os.BundleCompat.getParcelable(bundle, NotificationCompat.EXTRA_PROGRESS_END_ICON, Icon.class));
        }

        public ProgressStyle setProgress(int i2) {
            this.mProgress = i2;
            return this;
        }

        public ProgressStyle setProgressEndIcon(IconCompat iconCompat) {
            this.mEndIcon = iconCompat;
            return this;
        }

        public ProgressStyle setProgressIndeterminate(boolean z) {
            this.mIndeterminate = z;
            return this;
        }

        public ProgressStyle setProgressPoints(List<Point> list) {
            if (this.mProgressPoints == null) {
                this.mProgressPoints = new ArrayList();
            }
            this.mProgressPoints.clear();
            Iterator<Point> it = list.iterator();
            while (it.hasNext()) {
                addProgressPoint(it.next());
            }
            return this;
        }

        public ProgressStyle setProgressSegments(List<Segment> list) {
            if (this.mProgressSegments == null) {
                this.mProgressSegments = new ArrayList();
            }
            this.mProgressSegments.clear();
            Iterator<Segment> it = list.iterator();
            while (it.hasNext()) {
                addProgressSegment(it.next());
            }
            return this;
        }

        public ProgressStyle setProgressStartIcon(IconCompat iconCompat) {
            this.mStartIcon = iconCompat;
            return this;
        }

        public ProgressStyle setProgressTrackerIcon(IconCompat iconCompat) {
            this.mTrackerIcon = iconCompat;
            return this;
        }

        public ProgressStyle setStyledByProgress(boolean z) {
            this.mIsStyledByProgress = z;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SemanticStyle {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @Deprecated
    public NotificationCompat() {
    }

    public static ParcelableSpan createSemanticStyleAnnotation(int i2) {
        return new Annotation(ANNOTATION_SEMANTIC_STYLE_KEY, String.valueOf(i2));
    }

    public static Action getAction(Notification notification, int i2) {
        return getActionCompatFromAction(notification.actions[i2]);
    }

    static Action getActionCompatFromAction(Notification.Action action) {
        RemoteInput[] remoteInputArr;
        int emphasisHint;
        int styleHint;
        android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            RemoteInput[] remoteInputArr2 = new RemoteInput[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                android.app.RemoteInput remoteInput = remoteInputs[i2];
                remoteInputArr2[i2] = new RemoteInput(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Api29Impl.getEditChoicesBeforeSending(remoteInput), remoteInput.getExtras(), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || Api24Impl.getAllowGeneratedReplies(action);
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = Api28Impl.getSemanticAction(action);
        boolean zIsContextual = Api29Impl.isContextual(action);
        if (Build.VERSION.SDK_INT >= 37) {
            emphasisHint = Action.Builder.Api37Impl.getEmphasisHint(action);
            styleHint = Action.Builder.Api37Impl.getStyleHint(action);
        } else {
            emphasisHint = 0;
            styleHint = 0;
        }
        boolean zIsAuthenticationRequired = Build.VERSION.SDK_INT >= 31 ? Action.Builder.Api31Impl.isAuthenticationRequired(action) : false;
        if (action.getIcon() != null || action.icon == 0) {
            return new Action(action.getIcon() != null ? IconCompat.createFromIconOrNullIfZeroResId(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (RemoteInput[]) null, z, semanticAction, z2, zIsContextual, emphasisHint, styleHint, zIsAuthenticationRequired);
        }
        return new Action(action.icon, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (RemoteInput[]) null, z, semanticAction, z2, zIsContextual, emphasisHint, styleHint, zIsAuthenticationRequired);
    }

    public static int getActionCount(Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        return Api29Impl.getAllowSystemGeneratedContextualActions(notification);
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(Notification notification) {
        return Api26Impl.getBadgeIconType(notification);
    }

    public static BubbleMetadata getBubbleMetadata(Notification notification) {
        return BubbleMetadata.fromPlatform(Api29Impl.getBubbleMetadata(notification));
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static String getChannelId(Notification notification) {
        return Api26Impl.getChannelId(notification);
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @ReplaceWith(expression = "notification.extras")
    @Deprecated
    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static String getGroup(Notification notification) {
        return notification.getGroup();
    }

    public static int getGroupAlertBehavior(Notification notification) {
        return Api26Impl.getGroupAlertBehavior(notification);
    }

    static boolean getHighPriority(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List<Action> getInvisibleActions(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i2 = 0; i2 < bundle.size(); i2++) {
                arrayList.add(NotificationCompatJellybean.getActionFromBundle(bundle.getBundle(Integer.toString(i2))));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static LocusIdCompat getLocusId(Notification notification) {
        LocusId locusId = Api29Impl.getLocusId(notification);
        if (locusId == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(locusId);
    }

    static Notification[] getNotificationArrayFromBundle(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
            notificationArr[i2] = (Notification) parcelableArray[i2];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static List<Person> getPeople(Notification notification) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Person.fromAndroidPerson(be$$ExternalSyntheticApiModelOutline0.m(parcelableArrayList.get(i2))));
            }
        }
        return arrayList;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence getSettingsText(Notification notification) {
        return Api26Impl.getSettingsText(notification);
    }

    public static String getShortCriticalText(Notification notification) {
        return notification.extras.getString(EXTRA_SHORT_CRITICAL_TEXT);
    }

    public static String getShortcutId(Notification notification) {
        return Api26Impl.getShortcutId(notification);
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static String getSortKey(Notification notification) {
        return notification.getSortKey();
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(Notification notification) {
        return Api26Impl.getTimeoutAfter(notification);
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static boolean hasPromotableCharacteristics(Notification notification) {
        if (Build.VERSION.SDK_INT >= 36) {
            return Api36Impl.hasPromotableCharacteristics(notification);
        }
        return false;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static boolean isRequestPromotedOngoing(Notification notification) {
        return notification.extras.getBoolean(EXTRA_REQUEST_PROMOTED_ONGOING, false);
    }

    static boolean isSilent(Notification notification) {
        if (GROUP_KEY_SILENT.equals(notification.getGroup())) {
            return true;
        }
        return isGroupSummary(notification) ? getGroupAlertBehavior(notification) == 2 : getGroupAlertBehavior(notification) == 1;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap bitmap) {
        return bitmap;
    }

    /* compiled from: WazeSource */
    public class BigPictureStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        /* compiled from: WazeSource */
        class Api31Impl {
            private Api31Impl() {
            }

            static void setBigPicture(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void setContentDescription(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void showBigPictureWhenCollapsed(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        public BigPictureStyle(Builder builder) {
            setBuilder(builder);
        }

        private static IconCompat asIconCompat(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.createFromIcon((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat getPictureIcon(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(NotificationCompat.EXTRA_PICTURE);
            return parcelable != null ? asIconCompat(parcelable) : asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mPictureIcon != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.setBigPicture(bigContentTitle, this.mPictureIcon.toIcon(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null));
                } else if (this.mPictureIcon.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.mPictureIcon.getBitmap());
                }
            }
            if (this.mBigLargeIconSet) {
                if (this.mBigLargeIcon == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    bigContentTitle.bigLargeIcon(this.mBigLargeIcon.toIcon(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getContext() : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(bigContentTitle, this.mShowBigPictureWhenCollapsed);
                Api31Impl.setContentDescription(bigContentTitle, this.mPictureContentDescription);
            }
        }

        public BigPictureStyle bigLargeIcon(Bitmap bitmap) {
            this.mBigLargeIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            this.mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle bigPicture(Bitmap bitmap) {
            this.mPictureIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(NotificationCompat.EXTRA_PICTURE);
            bundle.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(bundle.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(bundle);
            this.mShowBigPictureWhenCollapsed = bundle.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public BigPictureStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigPictureStyle setContentDescription(CharSequence charSequence) {
            this.mPictureContentDescription = charSequence;
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.mShowBigPictureWhenCollapsed = z;
            return this;
        }

        public BigPictureStyle() {
        }

        public BigPictureStyle bigPicture(Icon icon) {
            this.mPictureIcon = IconCompat.createFromIcon(icon);
            return this;
        }

        public BigPictureStyle bigLargeIcon(Icon icon) {
            this.mBigLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            this.mBigLargeIconSet = true;
            return this;
        }
    }

    /* compiled from: WazeSource */
    public class BigTextStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle(Builder builder) {
            setBuilder(builder);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                bigTextStyleBigText.setSummaryText(this.mSummaryText);
            }
        }

        public BigTextStyle bigText(CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mBigText = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        public BigTextStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle() {
        }
    }

    /* compiled from: WazeSource */
    public class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        IconCompat mLargeIcon;
        boolean mLocalOnly;
        LocusIdCompat mLocusId;
        Notification mNotification;
        int mNumber;

        @Deprecated
        public ArrayList<String> mPeople;
        public ArrayList<Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortCriticalText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Object mSmallIcon;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        /* compiled from: WazeSource */
        class Api24Impl {
            private Api24Impl() {
            }

            static RemoteViews createBigContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static RemoteViews createContentView(Notification.Builder builder) {
                return builder.createContentView();
            }

            static RemoteViews createHeadsUpContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static Notification.Builder recoverBuilder(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public Builder(Context context, Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            Bundle bundle = notification.extras;
            Style styleExtractStyleFromNotification = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification));
            setContentText(NotificationCompat.getContentText(notification));
            Builder settingsText = setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification));
            settingsText.setStyle(styleExtractStyleFromNotification);
            Builder locusId = settingsText.setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification));
            locusId.setWhen(notification.when);
            Builder usesChronometer = locusId.setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification));
            usesChronometer.setAutoCancel(NotificationCompat.getAutoCancel(notification));
            usesChronometer.setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification));
            Builder number = usesChronometer.setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number);
            number.setTicker(notification.tickerText);
            Builder defaults = number.setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setSilent(NotificationCompat.isSilent(notification)).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults);
            defaults.setPriority(notification.priority);
            defaults.setColor(NotificationCompat.getColor(notification));
            defaults.setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, styleExtractStyleFromNotification));
            this.mSmallIcon = notification.getSmallIcon();
            Icon largeIcon = notification.getLargeIcon();
            if (largeIcon != null) {
                this.mLargeIcon = IconCompat.createFromIcon(largeIcon);
            }
            if (notification.actions != null && notification.actions.length != 0) {
                for (Notification.Action action : notification.actions) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                Iterator<Action> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && (stringArray.length) != 0) {
                for (String str : stringArray) {
                    addPerson(str);
                }
            }
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                int size = parcelableArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    addPerson(Person.fromAndroidPerson(be$$ExternalSyntheticApiModelOutline0.m(parcelableArrayList.get(i2))));
                }
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                setColorized(bundle.getBoolean(NotificationCompat.EXTRA_COLORIZED));
            }
            if (Build.VERSION.SDK_INT < 36 || !bundle.containsKey(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT)) {
                return;
            }
            setShortCriticalText(bundle.getString(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT));
        }

        private static Bundle getExtrasWithoutDuplicateData(Notification notification, Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(NotificationCompat.EXTRA_TITLE);
            bundle.remove(NotificationCompat.EXTRA_TEXT);
            bundle.remove(NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(NotificationCompat.EXTRA_SUB_TEXT);
            if (Build.VERSION.SDK_INT >= 36) {
                bundle.remove(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT);
            }
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        protected static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            return charSequence.length() > MAX_CHARSEQUENCE_LENGTH ? charSequence.subSequence(0, MAX_CHARSEQUENCE_LENGTH) : charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String safeCharSequenceToString(CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            return safeString(charSequence.toString());
        }

        private static String safeString(String str) {
            if (str == null) {
                return null;
            }
            return str.length() > MAX_CHARSEQUENCE_LENGTH ? str.substring(0, MAX_CHARSEQUENCE_LENGTH) : str;
        }

        private void setFlag(int i2, boolean z) {
            Notification notification = this.mNotification;
            if (z) {
                notification.flags = i2 | notification.flags;
            } else {
                notification.flags = (~i2) & notification.flags;
            }
        }

        private boolean useExistingRemoteView() {
            Style style = this.mStyle;
            return style == null || !style.displayCustomViewInline();
        }

        public Builder addAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new Action(i2, charSequence, pendingIntent));
            return this;
        }

        public Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Builder addInvisibleAction(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mInvisibleActions.add(new Action(i2, charSequence, pendingIntent));
            return this;
        }

        @Deprecated
        public Builder addPerson(String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle bundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public RemoteViews createBigContentView() {
            RemoteViews remoteViewsMakeBigContentView;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            return (style == null || (remoteViewsMakeBigContentView = style.makeBigContentView(notificationCompatBuilder)) == null) ? Api24Impl.createBigContentView(Api24Impl.recoverBuilder(this.mContext, notificationCompatBuilder.build())) : remoteViewsMakeBigContentView;
        }

        public RemoteViews createContentView() {
            RemoteViews remoteViewsMakeContentView;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            return (style == null || (remoteViewsMakeContentView = style.makeContentView(notificationCompatBuilder)) == null) ? Api24Impl.createContentView(Api24Impl.recoverBuilder(this.mContext, notificationCompatBuilder.build())) : remoteViewsMakeContentView;
        }

        public RemoteViews createHeadsUpContentView() {
            RemoteViews remoteViewsMakeHeadsUpContentView;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Style style = this.mStyle;
            return (style == null || (remoteViewsMakeHeadsUpContentView = style.makeHeadsUpContentView(notificationCompatBuilder)) == null) ? Api24Impl.createHeadsUpContentView(Api24Impl.recoverBuilder(this.mContext, notificationCompatBuilder.build())) : remoteViewsMakeHeadsUpContentView;
        }

        public Builder extend(Extender extender) {
            extender.extend(this);
            return this;
        }

        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        public int getColor() {
            return this.mColor;
        }

        public RemoteViews getContentView() {
            return this.mContentView;
        }

        public Bundle getExtras() {
            Bundle bundle = this.mExtras;
            if (bundle != null) {
                return bundle;
            }
            Bundle bundle2 = new Bundle();
            this.mExtras = bundle2;
            return bundle2;
        }

        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public int getPriority() {
            return this.mPriority;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0L;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        public Builder setBadgeIconType(int i2) {
            this.mBadgeIcon = i2;
            return this;
        }

        public Builder setBubbleMetadata(BubbleMetadata bubbleMetadata) {
            this.mBubbleMetadata = bubbleMetadata;
            return this;
        }

        public Builder setCategory(String str) {
            this.mCategory = str;
            return this;
        }

        public Builder setChannelId(String str) {
            this.mChannelId = str;
            return this;
        }

        public Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        public Builder setColor(int i2) {
            this.mColor = i2;
            return this;
        }

        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setContent(RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public Builder setContentInfo(CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public Builder setDefaults(int i2) {
            this.mNotification.defaults = i2;
            if ((i2 & 4) != 0) {
                this.mNotification.flags |= 1;
            }
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setForegroundServiceBehavior(int i2) {
            this.mFgsDeferBehavior = i2;
            return this;
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(128, z);
            return this;
        }

        public Builder setGroup(String str) {
            this.mGroupKey = str;
            return this;
        }

        public Builder setGroupAlertBehavior(int i2) {
            this.mGroupAlertBehavior = i2;
            return this;
        }

        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = bitmap == null ? null : IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public Builder setLights(int i2, int i3, int i4) {
            this.mNotification.ledARGB = i2;
            this.mNotification.ledOnMS = i3;
            this.mNotification.ledOffMS = i4;
            int i5 = 0;
            if (this.mNotification.ledOnMS != 0 && this.mNotification.ledOffMS != 0) {
                i5 = 1;
            }
            Notification notification = this.mNotification;
            notification.flags = i5 | (notification.flags & (-2));
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        public Builder setLocusId(LocusIdCompat locusIdCompat) {
            this.mLocusId = locusIdCompat;
            return this;
        }

        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public Builder setNumber(int i2) {
            this.mNumber = i2;
            return this;
        }

        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        public Builder setPriority(int i2) {
            this.mPriority = i2;
            return this;
        }

        public Builder setProgress(int i2, int i3, boolean z) {
            this.mProgressMax = i2;
            this.mProgress = i3;
            this.mProgressIndeterminate = z;
            return this;
        }

        public Builder setPublicVersion(Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public Builder setRequestPromotedOngoing(boolean z) {
            getExtras().putBoolean(NotificationCompat.EXTRA_REQUEST_PROMOTED_ONGOING, z);
            return this;
        }

        public Builder setSettingsText(CharSequence charSequence) {
            this.mSettingsText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setShortCriticalText(String str) {
            this.mShortCriticalText = str;
            if (Build.VERSION.SDK_INT < 36) {
                getExtras().putString(NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT, str);
            }
            return this;
        }

        public Builder setShortcutId(String str) {
            this.mShortcutId = str;
            return this;
        }

        public Builder setShortcutInfo(ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat != null) {
                this.mShortcutId = shortcutInfoCompat.getId();
                if (this.mLocusId == null) {
                    if (shortcutInfoCompat.getLocusId() != null) {
                        this.mLocusId = shortcutInfoCompat.getLocusId();
                    } else if (shortcutInfoCompat.getId() != null) {
                        this.mLocusId = new LocusIdCompat(shortcutInfoCompat.getId());
                    }
                }
                if (this.mContentTitle == null) {
                    setContentTitle(shortcutInfoCompat.getShortLabel());
                }
            }
            return this;
        }

        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        public Builder setSilent(boolean z) {
            this.mSilent = z;
            return this;
        }

        public Builder setSmallIcon(int i2, int i3) {
            this.mNotification.icon = i2;
            this.mNotification.iconLevel = i3;
            return this;
        }

        public Builder setSortKey(String str) {
            this.mSortKey = str;
            return this;
        }

        public Builder setSound(Uri uri) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = -1;
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(4).setUsage(5);
            this.mNotification.audioAttributes = usage.build();
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setSubText(CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        @Deprecated
        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public Builder setTimeoutAfter(long j2) {
            this.mTimeout = j2;
            return this;
        }

        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public Builder setVisibility(int i2) {
            this.mVisibility = i2;
            return this;
        }

        public Builder setWhen(long j2) {
            this.mNotification.when = j2;
            return this;
        }

        public Builder setSmallIcon(int i2) {
            this.mNotification.icon = i2;
            return this;
        }

        public Builder setSmallIcon(IconCompat iconCompat) {
            this.mSmallIcon = iconCompat.toIcon(this.mContext);
            return this;
        }

        public Builder addAction(Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        public Builder addInvisibleAction(Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        public Builder setLargeIcon(Icon icon) {
            this.mLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder addPerson(Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        public Builder setSound(Uri uri, int i2) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = i2;
            AudioAttributes.Builder legacyStreamType = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i2);
            this.mNotification.audioAttributes = legacyStreamType.build();
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated
        public Builder(Context context) {
            this(context, (String) null);
        }

        public Builder(Context context, String str) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }
    }

    /* compiled from: WazeSource */
    public class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private Integer mAnswerButtonColor;
        private PendingIntent mAnswerIntent;
        private int mCallType;
        private Integer mDeclineButtonColor;
        private PendingIntent mDeclineIntent;
        private PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private Person mPerson;
        private IconCompat mVerificationIcon;
        private CharSequence mVerificationText;

        /* compiled from: WazeSource */
        class Api28Impl {
            private Api28Impl() {
            }

            static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }

            static Parcelable castToParcelable(android.app.Person person) {
                return person;
            }
        }

        /* compiled from: WazeSource */
        class Api31Impl {
            private Api31Impl() {
            }

            static Notification.CallStyle forIncomingCall(android.app.Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle forOngoingCall(android.app.Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle forScreeningCall(android.app.Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle setAnswerButtonColorHint(Notification.CallStyle callStyle, int i2) {
                return callStyle.setAnswerButtonColorHint(i2);
            }

            static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }

            static Notification.CallStyle setDeclineButtonColorHint(Notification.CallStyle callStyle, int i2) {
                return callStyle.setDeclineButtonColorHint(i2);
            }

            static Notification.CallStyle setIsVideo(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            static Notification.CallStyle setVerificationIcon(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle setVerificationText(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        private CallStyle(int i2, Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (person == null || TextUtils.isEmpty(person.getName())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.mCallType = i2;
            this.mPerson = person;
            this.mAnswerIntent = pendingIntent3;
            this.mDeclineIntent = pendingIntent2;
            this.mHangUpIntent = pendingIntent;
        }

        public static CallStyle forIncomingCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return new CallStyle(1, person, null, (PendingIntent) j$.util.Objects.requireNonNull(pendingIntent, "declineIntent is required"), (PendingIntent) j$.util.Objects.requireNonNull(pendingIntent2, "answerIntent is required"));
        }

        public static CallStyle forOngoingCall(Person person, PendingIntent pendingIntent) {
            return new CallStyle(2, person, (PendingIntent) j$.util.Objects.requireNonNull(pendingIntent, "hangUpIntent is required"), null, null);
        }

        public static CallStyle forScreeningCall(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            return new CallStyle(3, person, (PendingIntent) j$.util.Objects.requireNonNull(pendingIntent, "hangUpIntent is required"), null, (PendingIntent) j$.util.Objects.requireNonNull(pendingIntent2, "answerIntent is required"));
        }

        private String getDefaultText() {
            int i2 = this.mCallType;
            if (i2 == 1) {
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
            }
            if (i2 == 2) {
                return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
            }
            if (i2 != 3) {
                return null;
            }
            return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
        }

        private boolean isActionAddedByCallStyle(Action action) {
            return action != null && action.getExtras().getBoolean(KEY_ACTION_PRIORITY);
        }

        private Action makeAction(int i2, int i3, Integer num, int i4, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, i4));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.mContext.getResources().getString(i3));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action actionBuild = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, i2), spannableStringBuilder, pendingIntent).build();
            actionBuild.getExtras().putBoolean(KEY_ACTION_PRIORITY, true);
            return actionBuild;
        }

        private Action makeAnswerAction() {
            PendingIntent pendingIntent = this.mAnswerIntent;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.mIsVideo;
            return makeAction(true != z ? R.drawable.ic_call_answer : R.drawable.ic_call_answer_video, true != z ? R.string.call_notification_answer_action : R.string.call_notification_answer_video_action, this.mAnswerButtonColor, R.color.call_notification_answer_color, pendingIntent);
        }

        private Action makeNegativeAction() {
            PendingIntent pendingIntent = this.mDeclineIntent;
            Integer num = this.mDeclineButtonColor;
            return pendingIntent == null ? makeAction(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, num, R.color.call_notification_decline_color, this.mHangUpIntent) : makeAction(R.drawable.ic_call_decline, R.string.call_notification_decline_action, num, R.color.call_notification_decline_color, pendingIntent);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.mCallType);
            bundle.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.mIsVideo);
            Person person = this.mPerson;
            if (person != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, person.toAndroidPerson());
            }
            IconCompat iconCompat = this.mVerificationIcon;
            if (iconCompat != null) {
                bundle.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, iconCompat.toIcon(this.mBuilder.mContext));
            }
            bundle.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.mVerificationText);
            bundle.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.mAnswerIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.mDeclineIntent);
            bundle.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.mHangUpIntent);
            Integer num = this.mAnswerButtonColor;
            if (num != null) {
                bundle.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            Integer num2 = this.mDeclineButtonColor;
            if (num2 != null) {
                bundle.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            CharSequence defaultText = null;
            callStyleForIncomingCall = null;
            Notification.CallStyle callStyleForIncomingCall = null;
            defaultText = null;
            if (Build.VERSION.SDK_INT < 31) {
                Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
                Person person = this.mPerson;
                builder.setContentTitle(person != null ? person.getName() : null);
                Bundle bundle = this.mBuilder.mExtras;
                if (bundle != null && bundle.containsKey(NotificationCompat.EXTRA_TEXT)) {
                    defaultText = this.mBuilder.mExtras.getCharSequence(NotificationCompat.EXTRA_TEXT);
                }
                if (defaultText == null) {
                    defaultText = getDefaultText();
                }
                builder.setContentText(defaultText);
                Person person2 = this.mPerson;
                if (person2 != null) {
                    if (person2.getIcon() != null) {
                        builder.setLargeIcon(this.mPerson.getIcon().toIcon(this.mBuilder.mContext));
                    }
                    Api28Impl.addPerson(builder, this.mPerson.toAndroidPerson());
                }
                builder.setCategory(NotificationCompat.CATEGORY_CALL);
                return;
            }
            int i2 = this.mCallType;
            if (i2 == 1) {
                callStyleForIncomingCall = Api31Impl.forIncomingCall(this.mPerson.toAndroidPerson(), this.mDeclineIntent, this.mAnswerIntent);
            } else if (i2 == 2) {
                callStyleForIncomingCall = Api31Impl.forOngoingCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent);
            } else if (i2 == 3) {
                callStyleForIncomingCall = Api31Impl.forScreeningCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent, this.mAnswerIntent);
            } else if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                Log.d(NotificationCompat.TAG, "Unrecognized call type in CallStyle: ".concat(String.valueOf(String.valueOf(this.mCallType))));
            }
            if (callStyleForIncomingCall != null) {
                callStyleForIncomingCall.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
                Integer num = this.mAnswerButtonColor;
                if (num != null) {
                    Api31Impl.setAnswerButtonColorHint(callStyleForIncomingCall, num.intValue());
                }
                Integer num2 = this.mDeclineButtonColor;
                if (num2 != null) {
                    Api31Impl.setDeclineButtonColorHint(callStyleForIncomingCall, num2.intValue());
                }
                Api31Impl.setVerificationText(callStyleForIncomingCall, this.mVerificationText);
                IconCompat iconCompat = this.mVerificationIcon;
                if (iconCompat != null) {
                    Api31Impl.setVerificationIcon(callStyleForIncomingCall, iconCompat.toIcon(this.mBuilder.mContext));
                }
                Api31Impl.setIsVideo(callStyleForIncomingCall, this.mIsVideo);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        public ArrayList<Action> getActionsListWithSystemActions() {
            Action actionMakeNegativeAction = makeNegativeAction();
            Action actionMakeAnswerAction = makeAnswerAction();
            ArrayList<Action> arrayList = new ArrayList<>(3);
            arrayList.add(actionMakeNegativeAction);
            ArrayList<Action> arrayList2 = this.mBuilder.mActions;
            int i2 = 2;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Action action = arrayList2.get(i3);
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!isActionAddedByCallStyle(action)) {
                        arrayList.add(action);
                        i2--;
                    }
                    if (actionMakeAnswerAction != null && i2 == 1) {
                        arrayList.add(actionMakeAnswerAction);
                        i2 = 0;
                    }
                }
            }
            if (actionMakeAnswerAction != null && i2 > 0) {
                arrayList.add(actionMakeAnswerAction);
            }
            return arrayList;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mCallType = bundle.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.mIsVideo = bundle.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.mPerson = Person.fromAndroidPerson(be$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable(NotificationCompat.EXTRA_CALL_PERSON)));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.mPerson = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.mVerificationIcon = IconCompat.createFromIcon((Icon) bundle.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.mVerificationIcon = IconCompat.createFromBundle(bundle.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.mVerificationText = bundle.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.mAnswerIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.mDeclineIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.mHangUpIntent = (PendingIntent) bundle.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            this.mAnswerButtonColor = bundle.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            this.mDeclineButtonColor = bundle.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR) ? Integer.valueOf(bundle.getInt(NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
        }

        public CallStyle setAnswerButtonColorHint(int i2) {
            this.mAnswerButtonColor = Integer.valueOf(i2);
            return this;
        }

        public CallStyle setDeclineButtonColorHint(int i2) {
            this.mDeclineButtonColor = Integer.valueOf(i2);
            return this;
        }

        public CallStyle setIsVideo(boolean z) {
            this.mIsVideo = z;
            return this;
        }

        public CallStyle setVerificationIcon(Icon icon) {
            this.mVerificationIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public CallStyle setVerificationText(CharSequence charSequence) {
            this.mVerificationText = charSequence;
            return this;
        }

        public CallStyle setVerificationIcon(Bitmap bitmap) {
            this.mVerificationIcon = IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public CallStyle() {
        }

        public CallStyle(Builder builder) {
            setBuilder(builder);
        }
    }

    /* compiled from: WazeSource */
    public final class Metric {
        private static final String KEY_LABEL = "label";
        private static final String KEY_SEMANTIC_STYLE = "semanticStyle";
        private static final String KEY_VALUE = "value";
        private final String mLabel;
        private final int mSemanticStyle;
        private final MetricValue mValue;

        /* compiled from: WazeSource */
        public final class FixedTime extends MetricValue {
            private static final String KEY_VALUE = "value";
            private final LocalTime mValue;

            public FixedTime(LocalTime localTime) {
                super();
                this.mValue = ((LocalTime) j$.util.Objects.requireNonNull(localTime)).truncatedTo(ChronoUnit.SECONDS);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static FixedTime fromBundle(Bundle bundle) {
                LocalTime localTimeOfSecondOfDay = bundle.containsKey(KEY_VALUE) ? LocalTime.ofSecondOfDay(bundle.getLong(KEY_VALUE)) : null;
                if (localTimeOfSecondOfDay != null) {
                    return new FixedTime(localTimeOfSecondOfDay);
                }
                return null;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FixedTime)) {
                    return false;
                }
                FixedTime fixedTime = (FixedTime) obj;
                if (this == fixedTime) {
                    return true;
                }
                return j$.util.Objects.equals(this.mValue, fixedTime.mValue);
            }

            public LocalTime getValue() {
                return this.mValue;
            }

            public int hashCode() {
                return j$.util.Objects.hash(this.mValue);
            }

            @Override // androidx.core.app.NotificationCompat.Metric.MetricValue
            void toBundle(Bundle bundle) {
                bundle.putLong(KEY_VALUE, this.mValue.toSecondOfDay());
            }

            public String toString() {
                return getClass().getSimpleName() + "{mValue=" + this.mValue + "}";
            }
        }

        /* compiled from: WazeSource */
        public abstract class MetricValue {
            private static final String KEY_TYPE = "_type";
            private static final int TYPE_FIXED_DATE = 2;
            private static final int TYPE_FIXED_FLOAT = 5;
            private static final int TYPE_FIXED_INT = 4;
            private static final int TYPE_FIXED_TEXT = 6;
            private static final int TYPE_FIXED_TIME = 3;
            private static final int TYPE_TIME_DIFFERENCE = 1;

            private MetricValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static MetricValue fromBundle(Bundle bundle) {
                switch (bundle.getInt(KEY_TYPE)) {
                    case 1:
                        return TimeDifference.fromBundle(bundle);
                    case 2:
                        return FixedDate.fromBundle(bundle);
                    case 3:
                        return FixedTime.fromBundle(bundle);
                    case 4:
                        return FixedInt.fromBundle(bundle);
                    case 5:
                        return FixedFloat.fromBundle(bundle);
                    case 6:
                        return FixedText.fromBundle(bundle);
                    default:
                        return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Bundle toBundle(MetricValue metricValue) {
                Bundle bundle = new Bundle();
                if (metricValue instanceof TimeDifference) {
                    bundle.putInt(KEY_TYPE, 1);
                } else if (metricValue instanceof FixedDate) {
                    bundle.putInt(KEY_TYPE, 2);
                } else if (metricValue instanceof FixedTime) {
                    bundle.putInt(KEY_TYPE, 3);
                } else if (metricValue instanceof FixedInt) {
                    bundle.putInt(KEY_TYPE, 4);
                } else if (metricValue instanceof FixedFloat) {
                    bundle.putInt(KEY_TYPE, 5);
                } else {
                    if (!(metricValue instanceof FixedText)) {
                        Objects.toString(metricValue);
                        throw new AssertionError("Impossible MetricValue subclass: ".concat(String.valueOf(metricValue)));
                    }
                    bundle.putInt(KEY_TYPE, 6);
                }
                metricValue.toBundle(bundle);
                return bundle;
            }

            abstract void toBundle(Bundle bundle);
        }

        public Metric(MetricValue metricValue, CharSequence charSequence, int i2) {
            this.mValue = (MetricValue) j$.util.Objects.requireNonNull(metricValue);
            this.mLabel = Builder.safeCharSequenceToString((CharSequence) j$.util.Objects.requireNonNull(charSequence));
            Preconditions.checkArgument(!NotificationCompat$Metric$$ExternalSyntheticBackport0.m(r1), "Metric label is required");
            this.mSemanticStyle = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Metric fromBundle(Bundle bundle) {
            MetricValue metricValueFromBundle;
            Bundle bundle2 = bundle.getBundle(KEY_VALUE);
            if (bundle2 == null || (metricValueFromBundle = MetricValue.fromBundle(bundle2)) == null) {
                return null;
            }
            return new Metric(metricValueFromBundle, bundle.getString(KEY_LABEL), bundle.getInt(KEY_SEMANTIC_STYLE, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bundle toBundle(Metric metric) {
            Bundle bundle = new Bundle();
            bundle.putBundle(KEY_VALUE, MetricValue.toBundle(metric.mValue));
            bundle.putString(KEY_LABEL, metric.mLabel);
            bundle.putInt(KEY_SEMANTIC_STYLE, metric.mSemanticStyle);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) obj;
            if (this == metric) {
                return true;
            }
            return j$.util.Objects.equals(this.mValue, metric.mValue) && j$.util.Objects.equals(this.mLabel, metric.mLabel) && this.mSemanticStyle == metric.mSemanticStyle;
        }

        public CharSequence getLabel() {
            return this.mLabel;
        }

        public int getSemanticStyle() {
            return this.mSemanticStyle;
        }

        public MetricValue getValue() {
            return this.mValue;
        }

        public int hashCode() {
            return j$.util.Objects.hash(this.mValue, this.mLabel, Integer.valueOf(this.mSemanticStyle));
        }

        public String toString() {
            return "Metric{mValue=" + this.mValue + ", mLabel=" + this.mLabel + ", mSemanticStyle=" + this.mSemanticStyle + "}";
        }

        /* compiled from: WazeSource */
        public final class FixedInt extends MetricValue {
            private static final String KEY_UNIT = "unit";
            private static final String KEY_VALUE = "value";
            private final String mUnit;
            private final int mValue;

            public FixedInt(int i2, CharSequence charSequence) {
                super();
                this.mValue = i2;
                this.mUnit = Builder.safeCharSequenceToString(charSequence);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static FixedInt fromBundle(Bundle bundle) {
                return new FixedInt(bundle.getInt(KEY_VALUE), bundle.getString(KEY_UNIT));
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FixedInt)) {
                    return false;
                }
                FixedInt fixedInt = (FixedInt) obj;
                if (this == fixedInt) {
                    return true;
                }
                return this.mValue == fixedInt.mValue && j$.util.Objects.equals(this.mUnit, fixedInt.mUnit);
            }

            public CharSequence getUnit() {
                return this.mUnit;
            }

            public int getValue() {
                return this.mValue;
            }

            public int hashCode() {
                return j$.util.Objects.hash(Integer.valueOf(this.mValue), this.mUnit);
            }

            @Override // androidx.core.app.NotificationCompat.Metric.MetricValue
            void toBundle(Bundle bundle) {
                bundle.putInt(KEY_VALUE, this.mValue);
                bundle.putString(KEY_UNIT, this.mUnit);
            }

            public String toString() {
                return getClass().getSimpleName() + "{mValue=" + this.mValue + ", mUnit=" + this.mUnit + "}";
            }

            public FixedInt(int i2) {
                this(i2, null);
            }
        }

        /* compiled from: WazeSource */
        public final class TimeDifference extends MetricValue {
            public static final int FORMAT_ADAPTIVE = 1;
            public static final int FORMAT_CHRONOMETER = 2;
            private static final String KEY_COUNT_DOWN = "countDown";
            private static final String KEY_FORMAT = "format";
            private static final String KEY_PAUSED_DURATION = "pausedDuration";
            private static final String KEY_ZERO_ELAPSED_REALTIME = "zeroElapsedRealtime";
            private static final String KEY_ZERO_TIME = "zeroTime";
            private final boolean mCountDown;
            private final int mFormat;
            private final Duration mPausedDuration;
            private final Long mZeroElapsedRealtime;
            private final Instant mZeroTime;

            /* compiled from: WazeSource */
            @Retention(RetentionPolicy.SOURCE)
            public @interface Format {
            }

            private TimeDifference(Instant instant, Long l2, Duration duration, boolean z, int i2) {
                super();
                Preconditions.checkArgument(((instant != null ? 1 : 0) + (l2 != null ? 1 : 0)) + (duration != null ? 1 : 0) == 1, "Exactly one of zeroTime, zeroElapsedRealtime, or pausedDuration must be present; received %s,%s,%s", instant, l2, duration);
                Preconditions.checkArgument(i2 > 0 && i2 <= 2, "Invalid format: %s", Integer.valueOf(i2));
                this.mZeroTime = instant;
                this.mZeroElapsedRealtime = l2;
                this.mPausedDuration = duration;
                this.mCountDown = z;
                this.mFormat = i2;
            }

            public static TimeDifference forPausedStopwatch(Duration duration, int i2) {
                return new TimeDifference(null, null, (Duration) j$.util.Objects.requireNonNull(duration), false, i2);
            }

            public static TimeDifference forPausedTimer(Duration duration, int i2) {
                return new TimeDifference(null, null, (Duration) j$.util.Objects.requireNonNull(duration), true, i2);
            }

            public static TimeDifference forStopwatch(Instant instant, int i2) {
                return new TimeDifference((Instant) j$.util.Objects.requireNonNull(instant), null, null, false, i2);
            }

            public static TimeDifference forTimer(Instant instant, int i2) {
                return new TimeDifference((Instant) j$.util.Objects.requireNonNull(instant), null, null, true, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static TimeDifference fromBundle(Bundle bundle) {
                Instant instantOfEpochMilli = bundle.containsKey(KEY_ZERO_TIME) ? Instant.ofEpochMilli(bundle.getLong(KEY_ZERO_TIME)) : null;
                Long lValueOf = bundle.containsKey(KEY_ZERO_ELAPSED_REALTIME) ? Long.valueOf(bundle.getLong(KEY_ZERO_ELAPSED_REALTIME)) : null;
                Duration durationOfMillis = bundle.containsKey(KEY_PAUSED_DURATION) ? Duration.ofMillis(bundle.getLong(KEY_PAUSED_DURATION)) : null;
                if (instantOfEpochMilli == null && lValueOf == null && durationOfMillis == null) {
                    return null;
                }
                return new TimeDifference(instantOfEpochMilli, lValueOf, durationOfMillis, bundle.getBoolean(KEY_COUNT_DOWN), bundle.getInt(KEY_FORMAT));
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof TimeDifference)) {
                    return false;
                }
                TimeDifference timeDifference = (TimeDifference) obj;
                if (this == timeDifference) {
                    return true;
                }
                return j$.util.Objects.equals(this.mZeroTime, timeDifference.mZeroTime) && j$.util.Objects.equals(this.mZeroElapsedRealtime, timeDifference.mZeroElapsedRealtime) && j$.util.Objects.equals(this.mPausedDuration, timeDifference.mPausedDuration) && this.mCountDown == timeDifference.mCountDown && this.mFormat == timeDifference.mFormat;
            }

            public int getFormat() {
                return this.mFormat;
            }

            public Duration getPausedDuration() {
                return this.mPausedDuration;
            }

            public Long getZeroElapsedRealtime() {
                return this.mZeroElapsedRealtime;
            }

            public Instant getZeroTime() {
                return this.mZeroTime;
            }

            public int hashCode() {
                return j$.util.Objects.hash(this.mZeroTime, this.mZeroElapsedRealtime, this.mPausedDuration, Boolean.valueOf(this.mCountDown), Integer.valueOf(this.mFormat));
            }

            public boolean isStopwatch() {
                return !this.mCountDown;
            }

            public boolean isTimer() {
                return this.mCountDown;
            }

            @Override // androidx.core.app.NotificationCompat.Metric.MetricValue
            void toBundle(Bundle bundle) {
                Instant instant = this.mZeroTime;
                if (instant != null) {
                    bundle.putLong(KEY_ZERO_TIME, instant.toEpochMilli());
                } else {
                    Long l2 = this.mZeroElapsedRealtime;
                    if (l2 != null) {
                        bundle.putLong(KEY_ZERO_ELAPSED_REALTIME, l2.longValue());
                    } else {
                        Duration duration = this.mPausedDuration;
                        if (duration != null) {
                            bundle.putLong(KEY_PAUSED_DURATION, duration.toMillis());
                        }
                    }
                }
                bundle.putBoolean(KEY_COUNT_DOWN, this.mCountDown);
                bundle.putInt(KEY_FORMAT, this.mFormat);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("TimeDifference{");
                if (this.mZeroTime != null) {
                    sb.append("mZeroTime=");
                    sb.append(this.mZeroTime);
                } else if (this.mZeroElapsedRealtime != null) {
                    sb.append("mZeroElapsedRealtime=");
                    sb.append(this.mZeroElapsedRealtime);
                } else if (this.mPausedDuration != null) {
                    sb.append("mPausedDuration=");
                    sb.append(this.mPausedDuration);
                }
                sb.append(", mCountDown=");
                sb.append(this.mCountDown);
                sb.append(", mFormat=");
                sb.append(this.mFormat);
                sb.append("}");
                return sb.toString();
            }

            public static TimeDifference forStopwatch(long j2, int i2) {
                return new TimeDifference(null, Long.valueOf(j2), null, false, i2);
            }

            public static TimeDifference forTimer(long j2, int i2) {
                return new TimeDifference(null, Long.valueOf(j2), null, true, i2);
            }
        }

        /* compiled from: WazeSource */
        public final class FixedText extends MetricValue {
            private static final String KEY_UNIT = "unit";
            private static final String KEY_VALUE = "value";
            private final String mUnit;
            private final String mValue;

            public FixedText(CharSequence charSequence, CharSequence charSequence2) {
                super();
                this.mValue = Builder.safeCharSequenceToString((CharSequence) j$.util.Objects.requireNonNull(charSequence));
                this.mUnit = Builder.safeCharSequenceToString(charSequence2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static FixedText fromBundle(Bundle bundle) {
                return new FixedText(bundle.getString(KEY_VALUE, ""), bundle.getString(KEY_UNIT));
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FixedText)) {
                    return false;
                }
                FixedText fixedText = (FixedText) obj;
                if (this == fixedText) {
                    return true;
                }
                return j$.util.Objects.equals(this.mValue, fixedText.mValue) && j$.util.Objects.equals(this.mUnit, fixedText.mUnit);
            }

            public CharSequence getUnit() {
                return this.mUnit;
            }

            public CharSequence getValue() {
                return this.mValue;
            }

            public int hashCode() {
                return j$.util.Objects.hash(this.mValue, this.mUnit);
            }

            @Override // androidx.core.app.NotificationCompat.Metric.MetricValue
            void toBundle(Bundle bundle) {
                bundle.putString(KEY_VALUE, this.mValue);
                bundle.putString(KEY_UNIT, this.mUnit);
            }

            public String toString() {
                return getClass().getSimpleName() + "{mValue=" + this.mValue + ", mUnit=" + this.mUnit + "}";
            }

            public FixedText(CharSequence charSequence) {
                this(charSequence, null);
            }
        }

        /* compiled from: WazeSource */
        public final class FixedDate extends MetricValue {
            public static final int FORMAT_AUTOMATIC = 0;
            public static final int FORMAT_LONG_DATE = 1;
            public static final int FORMAT_SHORT_DATE = 2;
            private static final String KEY_FORMAT = "format";
            private static final String KEY_VALUE = "value";
            private final int mFormat;
            private final LocalDate mValue;

            /* compiled from: WazeSource */
            @Retention(RetentionPolicy.SOURCE)
            public @interface Format {
            }

            public FixedDate(LocalDate localDate, int i2) {
                super();
                this.mValue = (LocalDate) j$.util.Objects.requireNonNull(localDate);
                Preconditions.checkArgument(i2 >= 0 && i2 <= 2, "Invalid format: %s", Integer.valueOf(i2));
                this.mFormat = i2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static FixedDate fromBundle(Bundle bundle) {
                LocalDate localDateOfEpochDay = bundle.containsKey(KEY_VALUE) ? LocalDate.ofEpochDay(bundle.getLong(KEY_VALUE)) : null;
                if (localDateOfEpochDay != null) {
                    return new FixedDate(localDateOfEpochDay, bundle.getInt(KEY_FORMAT, 0));
                }
                return null;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FixedDate)) {
                    return false;
                }
                FixedDate fixedDate = (FixedDate) obj;
                if (this == fixedDate) {
                    return true;
                }
                return j$.util.Objects.equals(this.mValue, fixedDate.mValue) && this.mFormat == fixedDate.mFormat;
            }

            public int getFormat() {
                return this.mFormat;
            }

            public LocalDate getValue() {
                return this.mValue;
            }

            public int hashCode() {
                return j$.util.Objects.hash(this.mValue, Integer.valueOf(this.mFormat));
            }

            @Override // androidx.core.app.NotificationCompat.Metric.MetricValue
            void toBundle(Bundle bundle) {
                bundle.putLong(KEY_VALUE, this.mValue.toEpochDay());
                bundle.putInt(KEY_FORMAT, this.mFormat);
            }

            public String toString() {
                return getClass().getSimpleName() + "{mValue=" + this.mValue + ", mFormat=" + this.mFormat + "}";
            }

            public FixedDate(LocalDate localDate) {
                this(localDate, 0);
            }
        }

        public Metric(MetricValue metricValue, CharSequence charSequence) {
            this(metricValue, charSequence, 0);
        }

        /* compiled from: WazeSource */
        public final class FixedFloat extends MetricValue {
            private static final int DEFAULT_MAX_FRACTION_DIGITS = 2;
            private static final int DEFAULT_MIN_FRACTION_DIGITS = 0;
            private static final String KEY_MAX_FRACTION_DIGITS = "maxDigits";
            private static final String KEY_MIN_FRACTION_DIGITS = "minDigits";
            private static final String KEY_UNIT = "unit";
            private static final String KEY_VALUE = "value";
            private static final int LOWER_BOUND_FRACTION_DIGITS = 0;
            private static final int UPPER_BOUND_FRACTION_DIGITS = 6;
            private final int mMaxFractionDigits;
            private final int mMinFractionDigits;
            private final String mUnit;
            private final float mValue;

            public FixedFloat(float f2, CharSequence charSequence, int i2, int i3) {
                super();
                this.mValue = f2;
                this.mUnit = Builder.safeCharSequenceToString(charSequence);
                boolean z = i2 >= 0 && i2 <= 6;
                Integer numValueOf = Integer.valueOf(i2);
                Preconditions.checkArgument(z, "Invalid minFractionDigits: %s", numValueOf);
                boolean z2 = i3 >= 0 && i3 <= 6;
                Integer numValueOf2 = Integer.valueOf(i3);
                Preconditions.checkArgument(z2, "Invalid maxFractionDigits: %s", numValueOf2);
                Preconditions.checkArgument(i2 <= i3, "Invalid minFractionDigits/maxFractionDigits: %s/%s", numValueOf, numValueOf2);
                this.mMinFractionDigits = i2;
                this.mMaxFractionDigits = i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static FixedFloat fromBundle(Bundle bundle) {
                return new FixedFloat(bundle.getFloat(KEY_VALUE), bundle.getString(KEY_UNIT), bundle.getInt(KEY_MIN_FRACTION_DIGITS, 0), bundle.getInt(KEY_MAX_FRACTION_DIGITS, 2));
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FixedFloat)) {
                    return false;
                }
                FixedFloat fixedFloat = (FixedFloat) obj;
                if (this == fixedFloat) {
                    return true;
                }
                return this.mValue == fixedFloat.mValue && j$.util.Objects.equals(this.mUnit, fixedFloat.mUnit) && this.mMinFractionDigits == fixedFloat.mMinFractionDigits && this.mMaxFractionDigits == fixedFloat.mMaxFractionDigits;
            }

            public int getMaxFractionDigits() {
                return this.mMaxFractionDigits;
            }

            public int getMinFractionDigits() {
                return this.mMinFractionDigits;
            }

            public CharSequence getUnit() {
                return this.mUnit;
            }

            public float getValue() {
                return this.mValue;
            }

            public int hashCode() {
                return j$.util.Objects.hash(Float.valueOf(this.mValue), this.mUnit, Integer.valueOf(this.mMinFractionDigits), Integer.valueOf(this.mMaxFractionDigits));
            }

            @Override // androidx.core.app.NotificationCompat.Metric.MetricValue
            void toBundle(Bundle bundle) {
                bundle.putFloat(KEY_VALUE, this.mValue);
                bundle.putString(KEY_UNIT, this.mUnit);
                bundle.putInt(KEY_MIN_FRACTION_DIGITS, this.mMinFractionDigits);
                bundle.putInt(KEY_MAX_FRACTION_DIGITS, this.mMaxFractionDigits);
            }

            public String toString() {
                return getClass().getSimpleName() + "{mValue=" + this.mValue + ", mUnit=" + this.mUnit + ", mMinFractionDigits=" + this.mMinFractionDigits + ", mMaxFractionDigits=" + this.mMaxFractionDigits + "}";
            }

            public FixedFloat(float f2, CharSequence charSequence) {
                this(f2, charSequence, 0, 2);
            }

            public FixedFloat(float f2) {
                this(f2, null);
            }
        }
    }

    /* compiled from: WazeSource */
    public class InboxStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle(Builder builder) {
            setBuilder(builder);
        }

        public InboxStyle addLine(CharSequence charSequence) {
            if (charSequence != null) {
                this.mTexts.add(Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            ArrayList<CharSequence> arrayList = this.mTexts;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bigContentTitle.addLine(arrayList.get(i2));
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mTexts.clear();
            if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.mTexts, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        public InboxStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public InboxStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle() {
        }
    }

    /* compiled from: WazeSource */
    public class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private CharSequence mConversationTitle;
        private Boolean mIsGroupConversation;
        private Person mUser;
        private final List<Message> mMessages = new ArrayList();
        private final List<Message> mHistoricMessages = new ArrayList();

        /* compiled from: WazeSource */
        class Api24Impl {
            private Api24Impl() {
            }

            static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle createMessagingStyle(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* compiled from: WazeSource */
        class Api26Impl {
            private Api26Impl() {
            }

            static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* compiled from: WazeSource */
        class Api28Impl {
            private Api28Impl() {
            }

            static Notification.MessagingStyle createMessagingStyle(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Person getUserPerson(Bundle bundle, String str) {
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable instanceof android.app.Person) {
                    return Person.fromAndroidPerson((android.app.Person) parcelable);
                }
                return null;
            }

            static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public MessagingStyle(Person person) {
            if (TextUtils.isEmpty(person.getName())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.mUser = person;
        }

        public static MessagingStyle extractMessagingStyleFromNotification(Notification notification) {
            Style styleExtractStyleFromNotification = Style.extractStyleFromNotification(notification);
            if (styleExtractStyleFromNotification instanceof MessagingStyle) {
                return (MessagingStyle) styleExtractStyleFromNotification;
            }
            return null;
        }

        private Message findLatestIncomingMessage() {
            int size = this.mMessages.size();
            while (true) {
                size--;
                List<Message> list = this.mMessages;
                if (size < 0) {
                    if (list.isEmpty()) {
                        return null;
                    }
                    return this.mMessages.get(r3.size() - 1);
                }
                Message message = list.get(size);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
        }

        private boolean hasMessagesWithoutSender() {
            int size = this.mMessages.size();
            while (true) {
                size--;
                if (size < 0) {
                    return false;
                }
                Message message = this.mMessages.get(size);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
        }

        private TextAppearanceSpan makeFontColorSpan(int i2) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null);
        }

        private CharSequence makeMessageLine(Message message) {
            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence name = message.getPerson() == null ? "" : message.getPerson().getName();
            int color = -16777216;
            if (TextUtils.isEmpty(name)) {
                name = this.mUser.getName();
                if (this.mBuilder.getColor() != 0) {
                    color = this.mBuilder.getColor();
                }
            }
            CharSequence charSequenceUnicodeWrap = bidiFormatter.unicodeWrap(name);
            spannableStringBuilder.append(charSequenceUnicodeWrap);
            spannableStringBuilder.setSpan(makeFontColorSpan(color), spannableStringBuilder.length() - charSequenceUnicodeWrap.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(bidiFormatter.unicodeWrap(message.getText() != null ? message.getText() : ""));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        public MessagingStyle addHistoricMessage(Message message) {
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        @Deprecated
        public MessagingStyle addMessage(CharSequence charSequence, long j2, CharSequence charSequence2) {
            Person.Builder builder = new Person.Builder();
            builder.setName(charSequence2);
            this.mMessages.add(new Message(charSequence, j2, builder.build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            setGroupConversation(isGroupConversation());
            Notification.MessagingStyle messagingStyleCreateMessagingStyle = Api28Impl.createMessagingStyle(this.mUser.toAndroidPerson());
            Iterator<Message> it = this.mMessages.iterator();
            while (it.hasNext()) {
                Api24Impl.addMessage(a$$ExternalSyntheticApiModelOutline0.m((Object) messagingStyleCreateMessagingStyle), it.next().toAndroidMessage());
            }
            Iterator<Message> it2 = this.mHistoricMessages.iterator();
            while (it2.hasNext()) {
                Api26Impl.addHistoricMessage(a$$ExternalSyntheticApiModelOutline0.m((Object) messagingStyleCreateMessagingStyle), it2.next().toAndroidMessage());
            }
            this.mIsGroupConversation.booleanValue();
            Notification.MessagingStyle messagingStyleM = a$$ExternalSyntheticApiModelOutline0.m((Object) messagingStyleCreateMessagingStyle);
            Api24Impl.setConversationTitle(messagingStyleM, this.mConversationTitle);
            Api28Impl.setGroupConversation(messagingStyleM, this.mIsGroupConversation.booleanValue());
            messagingStyleCreateMessagingStyle.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        public List<Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        public List<Message> getMessages() {
            return this.mMessages;
        }

        public Person getUser() {
            return this.mUser;
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        public boolean isGroupConversation() {
            Builder builder = this.mBuilder;
            if (builder != null && builder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.mIsGroupConversation == null) {
                return this.mConversationTitle != null;
            }
            Boolean bool = this.mIsGroupConversation;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.mMessages.clear();
            Person userPerson = bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_PERSON) ? Api28Impl.getUserPerson(bundle, NotificationCompat.EXTRA_MESSAGING_PERSON) : null;
            if (userPerson != null) {
                this.mUser = userPerson;
            } else if (bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = Person.fromBundle(bundle.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                Person.Builder builder = new Person.Builder();
                builder.setName(bundle.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME));
                this.mUser = builder.build();
            }
            CharSequence charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.mConversationTitle = charSequence;
            if (charSequence == null) {
                this.mConversationTitle = bundle.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(parcelableArray2));
            }
            if (bundle.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = Boolean.valueOf(bundle.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        public MessagingStyle setConversationTitle(CharSequence charSequence) {
            this.mConversationTitle = charSequence;
            return this;
        }

        public MessagingStyle setGroupConversation(boolean z) {
            this.mIsGroupConversation = Boolean.valueOf(z);
            return this;
        }

        /* compiled from: WazeSource */
        public final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";
            private String mDataMimeType;
            private Uri mDataUri;
            private Bundle mExtras;
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            /* compiled from: WazeSource */
            class Api24Impl {
                private Api24Impl() {
                }

                static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j2, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, charSequence2);
                }

                static Notification.MessagingStyle.Message setData(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* compiled from: WazeSource */
            class Api28Impl {
                private Api28Impl() {
                }

                static Parcelable castToParcelable(android.app.Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message createMessage(CharSequence charSequence, long j2, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, person);
                }

                static void setExtras(Notification.MessagingStyle.Message message, Bundle bundle) {
                    message.getExtras().putAll(bundle);
                }
            }

            public Message(CharSequence charSequence, long j2, Person person) {
                this.mExtras = new Bundle();
                this.mText = charSequence;
                this.mTimestamp = j2;
                this.mPerson = person;
            }

            static Bundle[] getBundleArrayForMessages(List<Message> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = list.get(i2).toBundle();
                }
                return bundleArr;
            }

            static Message getMessageFromBundle(Bundle bundle) {
                Person personBuild;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(KEY_TIMESTAMP)) {
                        if (bundle.containsKey(KEY_PERSON)) {
                            personBuild = Person.fromBundle(bundle.getBundle(KEY_PERSON));
                        } else if (bundle.containsKey(KEY_NOTIFICATION_PERSON)) {
                            personBuild = Person.fromAndroidPerson(be$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable(KEY_NOTIFICATION_PERSON)));
                        } else if (bundle.containsKey(KEY_SENDER)) {
                            Person.Builder builder = new Person.Builder();
                            builder.setName(bundle.getCharSequence(KEY_SENDER));
                            personBuild = builder.build();
                        } else {
                            personBuild = null;
                        }
                        Message message = new Message(bundle.getCharSequence("text"), bundle.getLong(KEY_TIMESTAMP), personBuild);
                        if (bundle.containsKey("type") && bundle.containsKey(KEY_DATA_URI)) {
                            message.setData(bundle.getString("type"), (Uri) bundle.getParcelable(KEY_DATA_URI));
                        }
                        if (bundle.containsKey(KEY_EXTRAS_BUNDLE)) {
                            message.getExtras().putAll(bundle.getBundle(KEY_EXTRAS_BUNDLE));
                        }
                        return message;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<Message> getMessagesFromBundleArray(Parcelable[] parcelableArr) {
                Message messageFromBundle;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (messageFromBundle = getMessageFromBundle((Bundle) parcelable)) != null) {
                        arrayList.add(messageFromBundle);
                    }
                }
                return arrayList;
            }

            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.mText;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(KEY_TIMESTAMP, this.mTimestamp);
                Person person = this.mPerson;
                if (person != null) {
                    bundle.putCharSequence(KEY_SENDER, person.getName());
                    bundle.putParcelable(KEY_NOTIFICATION_PERSON, this.mPerson.toAndroidPerson());
                }
                String str = this.mDataMimeType;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.mDataUri;
                if (uri != null) {
                    bundle.putParcelable(KEY_DATA_URI, uri);
                }
                Bundle bundle2 = this.mExtras;
                if (bundle2 != null) {
                    bundle.putBundle(KEY_EXTRAS_BUNDLE, bundle2);
                }
                return bundle;
            }

            public String getDataMimeType() {
                return this.mDataMimeType;
            }

            public Uri getDataUri() {
                return this.mDataUri;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            public Person getPerson() {
                return this.mPerson;
            }

            @Deprecated
            public CharSequence getSender() {
                Person person = this.mPerson;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            public Message setData(String str, Uri uri) {
                this.mDataMimeType = str;
                this.mDataUri = uri;
                return this;
            }

            Notification.MessagingStyle.Message toAndroidMessage() {
                Person person = getPerson();
                Notification.MessagingStyle.Message messageCreateMessage = Api28Impl.createMessage(getText(), getTimestamp(), person == null ? null : person.toAndroidPerson());
                if (getDataMimeType() != null) {
                    Api24Impl.setData(messageCreateMessage, getDataMimeType(), getDataUri());
                }
                Bundle bundle = this.mExtras;
                if (bundle != null) {
                    Api28Impl.setExtras(messageCreateMessage, bundle);
                }
                return messageCreateMessage;
            }

            @Deprecated
            public Message(CharSequence charSequence, long j2, CharSequence charSequence2) {
                Person.Builder builder = new Person.Builder();
                builder.setName(charSequence2);
                this(charSequence, j2, builder.build());
            }
        }

        MessagingStyle() {
        }

        public MessagingStyle addMessage(CharSequence charSequence, long j2, Person person) {
            addMessage(new Message(charSequence, j2, person));
            return this;
        }

        public MessagingStyle addMessage(Message message) {
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }

        @Deprecated
        public MessagingStyle(CharSequence charSequence) {
            Person.Builder builder = new Person.Builder();
            builder.setName(charSequence);
            this.mUser = builder.build();
        }
    }

    /* compiled from: WazeSource */
    public final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        /* compiled from: WazeSource */
        class Api29Impl {
            private Api29Impl() {
            }

            static BubbleMetadata fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Builder builder = new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble());
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent());
                builder.setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            static Notification.BubbleMetadata toPlatform(BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        /* compiled from: WazeSource */
        class Api30Impl {
            private Api30Impl() {
            }

            static BubbleMetadata fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Builder builder = bubbleMetadata.getShortcutId() != null ? new Builder(bubbleMetadata.getShortcutId()) : new Builder(bubbleMetadata.getIntent(), IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble());
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent());
                builder.setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            static Notification.BubbleMetadata toPlatform(BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = bubbleMetadata.getShortcutId() != null ? new Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId()) : new Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }

        private BubbleMetadata(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i2, int i3, int i4, String str) {
            this.mPendingIntent = pendingIntent;
            this.mIcon = iconCompat;
            this.mDesiredHeight = i2;
            this.mDesiredHeightResId = i3;
            this.mDeleteIntent = pendingIntent2;
            this.mFlags = i4;
            this.mShortcutId = str;
        }

        public static BubbleMetadata fromPlatform(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return Api30Impl.fromPlatform(bubbleMetadata);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return Api29Impl.fromPlatform(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata toPlatform(BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return Api30Impl.toPlatform(bubbleMetadata);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return Api29Impl.toPlatform(bubbleMetadata);
            }
            return null;
        }

        public boolean getAutoExpandBubble() {
            return (this.mFlags & 1) != 0;
        }

        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        public IconCompat getIcon() {
            return this.mIcon;
        }

        public PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        public String getShortcutId() {
            return this.mShortcutId;
        }

        public boolean isNotificationSuppressed() {
            return (this.mFlags & 2) != 0;
        }

        public void setFlags(int i2) {
            this.mFlags = i2;
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            public Builder(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.mPendingIntent = pendingIntent;
                this.mIcon = iconCompat;
            }

            private Builder setFlag(int i2, boolean z) {
                int i3 = this.mFlags;
                this.mFlags = z ? i2 | i3 : (~i2) & i3;
                return this;
            }

            public BubbleMetadata build() {
                String str = this.mShortcutId;
                if (str == null && this.mPendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.mIcon == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                PendingIntent pendingIntent = this.mPendingIntent;
                PendingIntent pendingIntent2 = this.mDeleteIntent;
                IconCompat iconCompat = this.mIcon;
                int i2 = this.mDesiredHeight;
                int i3 = this.mDesiredHeightResId;
                int i4 = this.mFlags;
                BubbleMetadata bubbleMetadata = new BubbleMetadata(pendingIntent, pendingIntent2, iconCompat, i2, i3, i4, str);
                bubbleMetadata.setFlags(i4);
                return bubbleMetadata;
            }

            public Builder setAutoExpandBubble(boolean z) {
                setFlag(1, z);
                return this;
            }

            public Builder setDeleteIntent(PendingIntent pendingIntent) {
                this.mDeleteIntent = pendingIntent;
                return this;
            }

            public Builder setDesiredHeight(int i2) {
                this.mDesiredHeight = Math.max(i2, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            public Builder setDesiredHeightResId(int i2) {
                this.mDesiredHeightResId = i2;
                this.mDesiredHeight = 0;
                return this;
            }

            public Builder setIcon(IconCompat iconCompat) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.mIcon = iconCompat;
                return this;
            }

            public Builder setIntent(PendingIntent pendingIntent) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.mPendingIntent = pendingIntent;
                return this;
            }

            public Builder setSuppressNotification(boolean z) {
                setFlag(2, z);
                return this;
            }

            @Deprecated
            public Builder() {
            }

            public Builder(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.mShortcutId = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
        }
    }

    /* compiled from: WazeSource */
    public final class ProjectedExtender implements Extender {
        static final String EXTRA_PROJECTED_EXTENDER = "android.projected.EXTENSIONS";
        static final String KEY_CONTENT_INTENT = "content_intent";
        private PendingIntent mContentIntent;

        public ProjectedExtender(Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras == null ? null : extras.getBundle(EXTRA_PROJECTED_EXTENDER);
            if (bundle != null) {
                this.mContentIntent = (PendingIntent) androidx.core.os.BundleCompat.getParcelable(bundle, KEY_CONTENT_INTENT, PendingIntent.class);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle bundle = new Bundle();
            PendingIntent pendingIntent = this.mContentIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_CONTENT_INTENT, pendingIntent);
            }
            builder.getExtras().putBundle(EXTRA_PROJECTED_EXTENDER, bundle);
            return builder;
        }

        public PendingIntent getContentIntent() {
            return this.mContentIntent;
        }

        public ProjectedExtender setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public ProjectedExtender() {
        }
    }

    /* compiled from: WazeSource */
    public class Action {
        public static final int EMPHASIS_AUTO = 0;
        public static final int EMPHASIS_PRIMARY = 1;
        public static final int EMPHASIS_SECONDARY = 2;
        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_PAUSE = 14;
        public static final int SEMANTIC_ACTION_PLAY = 13;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_STOP = 15;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public static final int STYLE_AUTO = 0;
        public static final int STYLE_ICON_AND_TEXT = 2;
        public static final int STYLE_ICON_ONLY = 3;
        public static final int STYLE_TEXT_ONLY = 1;
        public PendingIntent actionIntent;

        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        private final int mEmphasisHint;
        final Bundle mExtras;
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        private final int mStyleHint;
        public CharSequence title;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Emphasis {
        }

        /* compiled from: WazeSource */
        public interface Extender {
            Builder extend(Builder builder);
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Style {
        }

        Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, boolean z4) {
            this.mShowsUserInterface = true;
            this.mIcon = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.mExtras = bundle == null ? new Bundle() : bundle;
            this.mRemoteInputs = remoteInputArr;
            this.mDataOnlyRemoteInputs = remoteInputArr2;
            this.mAllowGeneratedReplies = z;
            this.mSemanticAction = i2;
            this.mShowsUserInterface = z2;
            this.mIsContextual = z3;
            this.mEmphasisHint = i3;
            this.mStyleHint = i4;
            this.mAuthenticationRequired = z4;
        }

        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        public int getEmphasisHint() {
            return this.mEmphasisHint;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        public IconCompat getIconCompat() {
            int i2;
            IconCompat iconCompat = this.mIcon;
            if (iconCompat != null || (i2 = this.icon) == 0) {
                return iconCompat;
            }
            IconCompat iconCompatCreateWithResource = IconCompat.createWithResource(null, "", i2);
            this.mIcon = iconCompatCreateWithResource;
            return iconCompatCreateWithResource;
        }

        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        public int getStyleHint() {
            return this.mStyleHint;
        }

        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        /* compiled from: WazeSource */
        public final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private int mEmphasisHint;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private int mStyleHint;
            private final CharSequence mTitle;

            /* compiled from: WazeSource */
            class Api24Impl {
                private Api24Impl() {
                }

                static boolean getAllowGeneratedReplies(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* compiled from: WazeSource */
            class Api28Impl {
                private Api28Impl() {
                }

                static int getSemanticAction(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* compiled from: WazeSource */
            class Api29Impl {
                private Api29Impl() {
                }

                static boolean isContextual(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* compiled from: WazeSource */
            class Api31Impl {
                private Api31Impl() {
                }

                static boolean isAuthenticationRequired(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            /* compiled from: WazeSource */
            class Api37Impl {
                private Api37Impl() {
                }

                static int getEmphasisHint(Notification.Action action) {
                    return action.getEmphasisHint();
                }

                static int getStyleHint(Notification.Action action) {
                    return action.getStyleHint();
                }
            }

            private Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = iconCompat;
                this.mTitle = Builder.limitCharSequenceLength(charSequence);
                this.mIntent = pendingIntent;
                this.mExtras = bundle;
                this.mRemoteInputs = remoteInputArr == null ? null : new ArrayList<>(Arrays.asList(remoteInputArr));
                this.mAllowGeneratedReplies = z;
                this.mSemanticAction = i2;
                this.mShowsUserInterface = z2;
                this.mIsContextual = z3;
                this.mAuthenticationRequired = z4;
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public static Builder fromAndroidAction(Notification.Action action) {
                Builder builder = action.getIcon() != null ? new Builder(IconCompat.createFromIconOrNullIfZeroResId(action.getIcon()), action.title, action.actionIntent) : new Builder(action.icon, action.title, action.actionIntent);
                android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && (remoteInputs.length) != 0) {
                    for (android.app.RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(RemoteInput.fromPlatform(remoteInput));
                    }
                }
                builder.mAllowGeneratedReplies = Api24Impl.getAllowGeneratedReplies(action);
                builder.setSemanticAction(Api28Impl.getSemanticAction(action));
                builder.setContextual(Api29Impl.isContextual(action));
                if (Build.VERSION.SDK_INT >= 31) {
                    builder.setAuthenticationRequired(Api31Impl.isAuthenticationRequired(action));
                }
                if (Build.VERSION.SDK_INT >= 37) {
                    builder.setStyleHint(Api37Impl.getStyleHint(action));
                    builder.setEmphasisHint(Api37Impl.getEmphasisHint(action));
                }
                builder.addExtras(action.getExtras());
                return builder;
            }

            public Builder addExtras(Bundle bundle) {
                if (bundle != null) {
                    this.mExtras.putAll(bundle);
                }
                return this;
            }

            public Builder addRemoteInput(RemoteInput remoteInput) {
                ArrayList<RemoteInput> arrayList = this.mRemoteInputs;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.mRemoteInputs = arrayList;
                }
                if (remoteInput != null) {
                    arrayList.add(remoteInput);
                }
                return this;
            }

            public Action build() {
                checkContextualActionNullFields();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<RemoteInput> arrayList3 = this.mRemoteInputs;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        RemoteInput remoteInput = arrayList3.get(i2);
                        if (remoteInput.isDataOnly()) {
                            arrayList.add(remoteInput);
                        } else {
                            arrayList2.add(remoteInput);
                        }
                    }
                }
                RemoteInput[] remoteInputArr = arrayList.isEmpty() ? null : (RemoteInput[]) arrayList.toArray(new RemoteInput[arrayList.size()]);
                return new Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()]), remoteInputArr, this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual, this.mEmphasisHint, this.mStyleHint, this.mAuthenticationRequired);
            }

            public Builder extend(Extender extender) {
                extender.extend(this);
                return this;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            public Builder setAllowGeneratedReplies(boolean z) {
                this.mAllowGeneratedReplies = z;
                return this;
            }

            public Builder setAuthenticationRequired(boolean z) {
                this.mAuthenticationRequired = z;
                return this;
            }

            public Builder setContextual(boolean z) {
                this.mIsContextual = z;
                return this;
            }

            public Builder setEmphasisHint(int i2) {
                this.mEmphasisHint = i2;
                return this;
            }

            public Builder setSemanticAction(int i2) {
                this.mSemanticAction = i2;
                return this;
            }

            public Builder setShowsUserInterface(boolean z) {
                this.mShowsUserInterface = z;
                return this;
            }

            public Builder setStyleHint(int i2) {
                this.mStyleHint = i2;
                return this;
            }

            public Builder(Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i2 != 0 ? IconCompat.createWithResource(null, "", i2) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }
        }

        /* compiled from: WazeSource */
        public final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags;
            private CharSequence mInProgressLabel;

            public WearableExtender(Action action) {
                this.mFlags = 1;
                Bundle bundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (bundle != null) {
                    this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                    this.mInProgressLabel = bundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = bundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = bundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }

            private void setFlag(int i2, boolean z) {
                int i3 = this.mFlags;
                this.mFlags = z ? i2 | i3 : (~i2) & i3;
            }

            /* renamed from: clone, reason: merged with bridge method [inline-methods] */
            public WearableExtender m11654clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.mFlags = this.mFlags;
                wearableExtender.mInProgressLabel = this.mInProgressLabel;
                wearableExtender.mConfirmLabel = this.mConfirmLabel;
                wearableExtender.mCancelLabel = this.mCancelLabel;
                return wearableExtender;
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public Builder extend(Builder builder) {
                Bundle bundle = new Bundle();
                int i2 = this.mFlags;
                if (i2 != 1) {
                    bundle.putInt(KEY_FLAGS, i2);
                }
                CharSequence charSequence = this.mInProgressLabel;
                if (charSequence != null) {
                    bundle.putCharSequence(KEY_IN_PROGRESS_LABEL, charSequence);
                }
                CharSequence charSequence2 = this.mConfirmLabel;
                if (charSequence2 != null) {
                    bundle.putCharSequence(KEY_CONFIRM_LABEL, charSequence2);
                }
                CharSequence charSequence3 = this.mCancelLabel;
                if (charSequence3 != null) {
                    bundle.putCharSequence(KEY_CANCEL_LABEL, charSequence3);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
                return builder;
            }

            @Deprecated
            public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            public boolean getHintDisplayActionInline() {
                return (this.mFlags & 4) != 0;
            }

            public boolean getHintLaunchesActivity() {
                return (this.mFlags & 2) != 0;
            }

            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            public boolean isAvailableOffline() {
                return (this.mFlags & 1) != 0;
            }

            public WearableExtender setAvailableOffline(boolean z) {
                setFlag(1, z);
                return this;
            }

            @Deprecated
            public WearableExtender setCancelLabel(CharSequence charSequence) {
                this.mCancelLabel = charSequence;
                return this;
            }

            @Deprecated
            public WearableExtender setConfirmLabel(CharSequence charSequence) {
                this.mConfirmLabel = charSequence;
                return this;
            }

            public WearableExtender setHintDisplayActionInline(boolean z) {
                setFlag(4, z);
                return this;
            }

            public WearableExtender setHintLaunchesActivity(boolean z) {
                setFlag(2, z);
                return this;
            }

            @Deprecated
            public WearableExtender setInProgressLabel(CharSequence charSequence) {
                this.mInProgressLabel = charSequence;
                return this;
            }

            public WearableExtender() {
                this.mFlags = 1;
            }
        }

        Action(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i3, boolean z2, boolean z3, int i4, int i5, boolean z4) {
            this(i2 != 0 ? IconCompat.createWithResource(null, "", i2) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i3, z2, z3, i4, i5, z4);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, 0, 0, false);
        }

        public Action(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.createWithResource(null, "", i2) : null, charSequence, pendingIntent);
        }
    }

    /* compiled from: WazeSource */
    public final class CarExtender implements Extender {
        static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        /* compiled from: WazeSource */
        class Api29Impl {
            private Api29Impl() {
            }

            static int getEditChoicesBeforeSending(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        /* compiled from: WazeSource */
        @Deprecated
        public class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            /* compiled from: WazeSource */
            public class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(String str) {
                    this.mParticipant = str;
                }

                public Builder addMessage(String str) {
                    if (str != null) {
                        this.mMessages.add(str);
                    }
                    return this;
                }

                public UnreadConversation build() {
                    return new UnreadConversation((String[]) this.mMessages.toArray(new String[this.mMessages.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, new String[]{this.mParticipant}, this.mLatestTimestamp);
                }

                public Builder setLatestTimestamp(long j2) {
                    this.mLatestTimestamp = j2;
                    return this;
                }

                public Builder setReadPendingIntent(PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }
            }

            UnreadConversation(String[] strArr, RemoteInput remoteInput, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j2) {
                this.mMessages = strArr;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = pendingIntent2;
                this.mReplyPendingIntent = pendingIntent;
                this.mParticipants = strArr2;
                this.mLatestTimestamp = j2;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            public String[] getMessages() {
                return this.mMessages;
            }

            public String getParticipant() {
                String[] strArr = this.mParticipants;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public String[] getParticipants() {
                return this.mParticipants;
            }

            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }
        }

        public CarExtender(Notification notification) {
            this.mColor = 0;
            Bundle bundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            if (bundle != null) {
                this.mLargeIcon = (Bitmap) bundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = bundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(bundle.getBundle(EXTRA_CONVERSATION));
            }
        }

        private static Bundle getBundleForUnreadConversation(UnreadConversation unreadConversation) {
            Bundle bundle = new Bundle();
            String str = null;
            if (unreadConversation.getParticipants() != null && unreadConversation.getParticipants().length > 1) {
                str = unreadConversation.getParticipants()[0];
            }
            int length = unreadConversation.getMessages().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i2 = 0; i2 < length; i2++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i2]);
                bundle2.putString(KEY_AUTHOR, str);
                parcelableArr[i2] = bundle2;
            }
            bundle.putParcelableArray(KEY_MESSAGES, parcelableArr);
            RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                RemoteInput.Builder builder = new RemoteInput.Builder(remoteInput.getResultKey());
                builder.setLabel(remoteInput.getLabel());
                builder.setChoices(remoteInput.getChoices());
                builder.setAllowFreeFormInput(remoteInput.getAllowFreeFormInput());
                builder.addExtras(remoteInput.getExtras());
                bundle.putParcelable(KEY_REMOTE_INPUT, builder.build());
            }
            bundle.putParcelable(KEY_ON_REPLY, unreadConversation.getReplyPendingIntent());
            bundle.putParcelable(KEY_ON_READ, unreadConversation.getReadPendingIntent());
            bundle.putStringArray(KEY_PARTICIPANTS, unreadConversation.getParticipants());
            bundle.putLong(KEY_TIMESTAMP, unreadConversation.getLatestTimestamp());
            return bundle;
        }

        private static UnreadConversation getUnreadConversationFromBundle(Bundle bundle) {
            String[] strArr;
            if (bundle != null) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_MESSAGES);
                if (parcelableArray != null) {
                    int length = parcelableArray.length;
                    String[] strArr2 = new String[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        Parcelable parcelable = parcelableArray[i2];
                        if (!(parcelable instanceof Bundle)) {
                            break;
                        }
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i2] = string;
                        if (string == null) {
                            break;
                        }
                    }
                    strArr = strArr2;
                } else {
                    strArr = null;
                }
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ON_READ);
                PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(KEY_ON_REPLY);
                android.app.RemoteInput remoteInput = (android.app.RemoteInput) bundle.getParcelable(KEY_REMOTE_INPUT);
                String[] stringArray = bundle.getStringArray(KEY_PARTICIPANTS);
                if (stringArray != null && stringArray.length == 1) {
                    return new UnreadConversation(strArr, remoteInput != null ? new RemoteInput(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Api29Impl.getEditChoicesBeforeSending(remoteInput), remoteInput.getExtras(), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong(KEY_TIMESTAMP));
                }
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.mLargeIcon;
            if (bitmap != null) {
                bundle.putParcelable(EXTRA_LARGE_ICON, bitmap);
            }
            int i2 = this.mColor;
            if (i2 != 0) {
                bundle.putInt(EXTRA_COLOR, i2);
            }
            UnreadConversation unreadConversation = this.mUnreadConversation;
            if (unreadConversation != null) {
                bundle.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(unreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, bundle);
            return builder;
        }

        public int getColor() {
            return this.mColor;
        }

        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        public CarExtender setColor(int i2) {
            this.mColor = i2;
            return this;
        }

        public CarExtender setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = bitmap;
            return this;
        }

        @Deprecated
        public CarExtender setUnreadConversation(UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        public CarExtender() {
            this.mColor = 0;
        }
    }

    /* compiled from: WazeSource */
    public abstract class Style {
        CharSequence mBigContentTitle;
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        /* compiled from: WazeSource */
        class Api24Impl {
            private Api24Impl() {
            }

            static void setChronometerCountDown(RemoteViews remoteViews, int i2, boolean z) {
                remoteViews.setChronometerCountDown(i2, z);
            }
        }

        private int calculateTopPadding() throws Resources.NotFoundException {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float fConstrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fConstrain) * dimensionPixelSize) + (fConstrain * dimensionPixelSize2));
        }

        private static float constrain(float f2, float f3, float f4) {
            return f2 >= f3 ? f2 <= f4 ? f2 : f4 : f3;
        }

        static Style constructCompatStyleByName(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1915466044:
                    if (str.equals("androidx.core.app.NotificationCompat$ProgressStyle")) {
                        return new ProgressStyle();
                    }
                    return null;
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        return new DecoratedCustomViewStyle();
                    }
                    return null;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        return new BigPictureStyle();
                    }
                    return null;
                case -128932575:
                    if (str.equals("androidx.core.app.NotificationCompat$MetricStyle")) {
                        return new MetricStyle();
                    }
                    return null;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        return new CallStyle();
                    }
                    return null;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        return new InboxStyle();
                    }
                    return null;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        return new BigTextStyle();
                    }
                    return null;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        return new MessagingStyle();
                    }
                    return null;
                default:
                    return null;
            }
        }

        private static Style constructCompatStyleByPlatformName(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (Build.VERSION.SDK_INT >= 36 && str.equals(n$$ExternalSyntheticApiModelOutline0.m13516m().getName())) {
                return new ProgressStyle();
            }
            if (str.equals(a$$ExternalSyntheticApiModelOutline0.m$2().getName())) {
                return new MessagingStyle();
            }
            if (str.equals(a$$ExternalSyntheticApiModelOutline0.m$1().getName())) {
                return new DecoratedCustomViewStyle();
            }
            if (Build.VERSION.SDK_INT < 37 || !str.equals(NotificationCompat$Style$$ExternalSyntheticApiModelOutline2.m().getName())) {
                return null;
            }
            return new MetricStyle();
        }

        static Style constructCompatStyleForBundle(Bundle bundle) {
            Style styleConstructCompatStyleByName = constructCompatStyleByName(bundle.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            return styleConstructCompatStyleByName != null ? styleConstructCompatStyleByName : (bundle.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) ? new MessagingStyle() : (bundle.containsKey(NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) ? new BigPictureStyle() : bundle.containsKey(NotificationCompat.EXTRA_BIG_TEXT) ? new BigTextStyle() : bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES) ? new InboxStyle() : bundle.containsKey(NotificationCompat.EXTRA_CALL_TYPE) ? new CallStyle() : (bundle.containsKey(NotificationCompat.EXTRA_PROGRESS_SEGMENTS) || bundle.containsKey(NotificationCompat.EXTRA_PROGRESS_POINTS)) ? new ProgressStyle() : bundle.containsKey("android.metrics") ? new MetricStyle() : constructCompatStyleByPlatformName(bundle.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        static Style constructStyleForExtras(Bundle bundle) {
            Style styleConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (styleConstructCompatStyleForBundle == null) {
                return null;
            }
            try {
                styleConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return styleConstructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap createColoredBitmap(IconCompat iconCompat, int i2, int i3) {
            int intrinsicWidth;
            Drawable drawableLoadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            if (i3 == 0) {
                intrinsicWidth = drawableLoadDrawable.getIntrinsicWidth();
                i3 = 0;
            } else {
                intrinsicWidth = i3;
            }
            if (i3 == 0) {
                i3 = drawableLoadDrawable.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            drawableLoadDrawable.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawableLoadDrawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            drawableLoadDrawable.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Bitmap createIconWithBackground(int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                i5 = 0;
            }
            Bitmap bitmapCreateColoredBitmap = createColoredBitmap(R.drawable.notification_icon_background, i5, i3);
            Canvas canvas = new Canvas(bitmapCreateColoredBitmap);
            Drawable drawableMutate = this.mBuilder.mContext.getResources().getDrawable(i2).mutate();
            drawableMutate.setFilterBitmap(true);
            int i6 = (i3 - i4) / 2;
            int i7 = i4 + i6;
            drawableMutate.setBounds(i6, i6, i7, i7);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapCreateColoredBitmap;
        }

        public static Style extractStyleFromNotification(Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.id_0x7f0a0797, 8);
        }

        public void addCompatExtras(Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean r13, int r14, boolean r15) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            remoteViews.removeAllViews(R.id.notification_main_column);
            remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.notification_main_column, 0);
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
        }

        protected void clearCompatExtraKeys(Bundle bundle) {
            bundle.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        protected String getClassName() {
            return null;
        }

        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        protected void restoreFromCompatExtras(Bundle bundle) {
            if (bundle.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = bundle.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        private Bitmap createColoredBitmap(int i2, int i3, int i4) {
            return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, i2), i3, i4);
        }

        Bitmap createColoredBitmap(IconCompat iconCompat, int i2) {
            return createColoredBitmap(iconCompat, i2, 0);
        }

        public Bitmap createColoredBitmap(int i2, int i3) {
            return createColoredBitmap(i2, i3, 0);
        }
    }

    /* compiled from: WazeSource */
    public final class TvExtender implements Extender {
        static final String EXTRA_CHANNEL_ID = "channel_id";
        static final String EXTRA_CONTENT_INTENT = "content_intent";
        static final String EXTRA_DELETE_INTENT = "delete_intent";
        private static final String EXTRA_FLAGS = "flags";
        static final String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        static final String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final String TAG = "TvExtender";
        private String mChannelId;
        private PendingIntent mContentIntent;
        private PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender(Notification notification) {
            Bundle bundle = notification.extras == null ? null : notification.extras.getBundle(EXTRA_TV_EXTENDER);
            if (bundle != null) {
                this.mFlags = bundle.getInt(EXTRA_FLAGS);
                this.mChannelId = bundle.getString(EXTRA_CHANNEL_ID);
                this.mSuppressShowOverApps = bundle.getBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS);
                this.mContentIntent = (PendingIntent) bundle.getParcelable(EXTRA_CONTENT_INTENT);
                this.mDeleteIntent = (PendingIntent) bundle.getParcelable(EXTRA_DELETE_INTENT);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle bundle = new Bundle();
            bundle.putInt(EXTRA_FLAGS, this.mFlags);
            bundle.putString(EXTRA_CHANNEL_ID, this.mChannelId);
            bundle.putBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS, this.mSuppressShowOverApps);
            PendingIntent pendingIntent = this.mContentIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(EXTRA_CONTENT_INTENT, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.mDeleteIntent;
            if (pendingIntent2 != null) {
                bundle.putParcelable(EXTRA_DELETE_INTENT, pendingIntent2);
            }
            builder.getExtras().putBundle(EXTRA_TV_EXTENDER, bundle);
            return builder;
        }

        public String getChannelId() {
            return this.mChannelId;
        }

        public PendingIntent getContentIntent() {
            return this.mContentIntent;
        }

        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public boolean isAvailableOnTv() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isSuppressShowOverApps() {
            return this.mSuppressShowOverApps;
        }

        public TvExtender setChannelId(String str) {
            this.mChannelId = str;
            return this;
        }

        public TvExtender setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public TvExtender setDeleteIntent(PendingIntent pendingIntent) {
            this.mDeleteIntent = pendingIntent;
            return this;
        }

        public TvExtender setSuppressShowOverApps(boolean z) {
            this.mSuppressShowOverApps = z;
            return this;
        }

        public TvExtender() {
            this.mFlags = 1;
        }
    }

    /* compiled from: WazeSource */
    public final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";

        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @Deprecated
        public static final int SIZE_DEFAULT = 0;

        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @Deprecated
        public static final int SIZE_LARGE = 4;

        @Deprecated
        public static final int SIZE_MEDIUM = 3;

        @Deprecated
        public static final int SIZE_SMALL = 2;

        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions;
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex;
        private int mContentIcon;
        private int mContentIconGravity;
        private int mCustomContentHeight;
        private int mCustomSizePreset;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags;
        private int mGravity;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages;

        /* compiled from: WazeSource */
        class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        /* compiled from: WazeSource */
        class Api31Impl {
            private Api31Impl() {
            }

            static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }

        public WearableExtender(Notification notification) {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
            Bundle extras = NotificationCompat.getExtras(notification);
            Bundle bundle = extras != null ? extras.getBundle(EXTRA_WEARABLE_EXTENSIONS) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_ACTIONS);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    Action[] actionArr = new Action[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        actionArr[i2] = NotificationCompat.getActionCompatFromAction((Notification.Action) parcelableArrayList.get(i2));
                    }
                    Collections.addAll(this.mActions, actionArr);
                }
                this.mFlags = bundle.getInt(KEY_FLAGS, 1);
                this.mDisplayIntent = (PendingIntent) bundle.getParcelable(KEY_DISPLAY_INTENT);
                Notification[] notificationArrayFromBundle = NotificationCompat.getNotificationArrayFromBundle(bundle, KEY_PAGES);
                if (notificationArrayFromBundle != null) {
                    Collections.addAll(this.mPages, notificationArrayFromBundle);
                }
                this.mBackground = (Bitmap) bundle.getParcelable(KEY_BACKGROUND);
                this.mContentIcon = bundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = bundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
                this.mContentActionIndex = bundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = bundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = bundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = bundle.getInt(KEY_GRAVITY, 80);
                this.mHintScreenTimeout = bundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = bundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = bundle.getString(KEY_BRIDGE_TAG);
            }
        }

        private static Notification.Action getActionFromActionCompat(Action action) {
            IconCompat iconCompat = action.getIconCompat();
            Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat == null ? null : iconCompat.toIcon(), action.getTitle(), action.getActionIntent());
            Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            Api24Impl.setAllowGeneratedReplies(builder, action.getAllowGeneratedReplies());
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.setAuthenticationRequired(builder, action.isAuthenticationRequired());
            }
            builder.addExtras(bundle);
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(remoteInputs)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        private void setFlag(int i2, boolean z) {
            int i3 = this.mFlags;
            this.mFlags = z ? i2 | i3 : (~i2) & i3;
        }

        public WearableExtender addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        public WearableExtender addActions(List<Action> list) {
            this.mActions.addAll(list);
            return this;
        }

        @Deprecated
        public WearableExtender addPage(Notification notification) {
            this.mPages.add(notification);
            return this;
        }

        @Deprecated
        public WearableExtender addPages(List<Notification> list) {
            this.mPages.addAll(list);
            return this;
        }

        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public WearableExtender m11667clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.mActions = new ArrayList<>(this.mActions);
            wearableExtender.mFlags = this.mFlags;
            wearableExtender.mDisplayIntent = this.mDisplayIntent;
            wearableExtender.mPages = new ArrayList<>(this.mPages);
            wearableExtender.mBackground = this.mBackground;
            wearableExtender.mContentIcon = this.mContentIcon;
            wearableExtender.mContentIconGravity = this.mContentIconGravity;
            wearableExtender.mContentActionIndex = this.mContentActionIndex;
            wearableExtender.mCustomSizePreset = this.mCustomSizePreset;
            wearableExtender.mCustomContentHeight = this.mCustomContentHeight;
            wearableExtender.mGravity = this.mGravity;
            wearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
            wearableExtender.mDismissalId = this.mDismissalId;
            wearableExtender.mBridgeTag = this.mBridgeTag;
            return wearableExtender;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public Builder extend(Builder builder) {
            Bundle bundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.mActions.size());
                ArrayList<Action> arrayList2 = this.mActions;
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(getActionFromActionCompat(arrayList2.get(i2)));
                }
                bundle.putParcelableArrayList(KEY_ACTIONS, arrayList);
            }
            int i3 = this.mFlags;
            if (i3 != 1) {
                bundle.putInt(KEY_FLAGS, i3);
            }
            PendingIntent pendingIntent = this.mDisplayIntent;
            if (pendingIntent != null) {
                bundle.putParcelable(KEY_DISPLAY_INTENT, pendingIntent);
            }
            if (!this.mPages.isEmpty()) {
                ArrayList<Notification> arrayList3 = this.mPages;
                bundle.putParcelableArray(KEY_PAGES, (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
            }
            Bitmap bitmap = this.mBackground;
            if (bitmap != null) {
                bundle.putParcelable(KEY_BACKGROUND, bitmap);
            }
            int i4 = this.mContentIcon;
            if (i4 != 0) {
                bundle.putInt(KEY_CONTENT_ICON, i4);
            }
            int i5 = this.mContentIconGravity;
            if (i5 != 8388613) {
                bundle.putInt(KEY_CONTENT_ICON_GRAVITY, i5);
            }
            int i6 = this.mContentActionIndex;
            if (i6 != -1) {
                bundle.putInt(KEY_CONTENT_ACTION_INDEX, i6);
            }
            int i7 = this.mCustomSizePreset;
            if (i7 != 0) {
                bundle.putInt(KEY_CUSTOM_SIZE_PRESET, i7);
            }
            int i8 = this.mCustomContentHeight;
            if (i8 != 0) {
                bundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, i8);
            }
            int i9 = this.mGravity;
            if (i9 != 80) {
                bundle.putInt(KEY_GRAVITY, i9);
            }
            int i10 = this.mHintScreenTimeout;
            if (i10 != 0) {
                bundle.putInt(KEY_HINT_SCREEN_TIMEOUT, i10);
            }
            String str = this.mDismissalId;
            if (str != null) {
                bundle.putString(KEY_DISMISSAL_ID, str);
            }
            String str2 = this.mBridgeTag;
            if (str2 != null) {
                bundle.putString(KEY_BRIDGE_TAG, str2);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, bundle);
            return builder;
        }

        public List<Action> getActions() {
            return this.mActions;
        }

        @Deprecated
        public Bitmap getBackground() {
            return this.mBackground;
        }

        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public boolean getContentIntentAvailableOffline() {
            return (this.mFlags & 1) != 0;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        public String getDismissalId() {
            return this.mDismissalId;
        }

        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.mFlags & 32) != 0;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.mFlags & 16) != 0;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return (this.mFlags & 64) != 0;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            return (this.mFlags & 2) != 0;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.mFlags & 4) != 0;
        }

        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }

        public boolean getStartScrollBottom() {
            return (this.mFlags & 8) != 0;
        }

        @Deprecated
        public WearableExtender setBackground(Bitmap bitmap) {
            this.mBackground = bitmap;
            return this;
        }

        public WearableExtender setBridgeTag(String str) {
            this.mBridgeTag = str;
            return this;
        }

        public WearableExtender setContentAction(int i2) {
            this.mContentActionIndex = i2;
            return this;
        }

        @Deprecated
        public WearableExtender setContentIcon(int i2) {
            this.mContentIcon = i2;
            return this;
        }

        @Deprecated
        public WearableExtender setContentIconGravity(int i2) {
            this.mContentIconGravity = i2;
            return this;
        }

        public WearableExtender setContentIntentAvailableOffline(boolean z) {
            setFlag(1, z);
            return this;
        }

        @Deprecated
        public WearableExtender setCustomContentHeight(int i2) {
            this.mCustomContentHeight = i2;
            return this;
        }

        @Deprecated
        public WearableExtender setCustomSizePreset(int i2) {
            this.mCustomSizePreset = i2;
            return this;
        }

        public WearableExtender setDismissalId(String str) {
            this.mDismissalId = str;
            return this;
        }

        @Deprecated
        public WearableExtender setDisplayIntent(PendingIntent pendingIntent) {
            this.mDisplayIntent = pendingIntent;
            return this;
        }

        @Deprecated
        public WearableExtender setGravity(int i2) {
            this.mGravity = i2;
            return this;
        }

        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean z) {
            setFlag(32, z);
            return this;
        }

        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            setFlag(16, z);
            return this;
        }

        public WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            setFlag(64, z);
            return this;
        }

        @Deprecated
        public WearableExtender setHintHideIcon(boolean z) {
            setFlag(2, z);
            return this;
        }

        @Deprecated
        public WearableExtender setHintScreenTimeout(int i2) {
            this.mHintScreenTimeout = i2;
            return this;
        }

        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean z) {
            setFlag(4, z);
            return this;
        }

        public WearableExtender setStartScrollBottom(boolean z) {
            setFlag(8, z);
            return this;
        }

        public WearableExtender() {
            this.mActions = new ArrayList<>();
            this.mFlags = 1;
            this.mPages = new ArrayList<>();
            this.mContentIconGravity = 8388613;
            this.mContentActionIndex = -1;
            this.mCustomSizePreset = 0;
            this.mGravity = 80;
        }
    }
}
