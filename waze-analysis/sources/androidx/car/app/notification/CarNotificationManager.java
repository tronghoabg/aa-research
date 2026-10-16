package androidx.car.app.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import androidx.car.app.model.CarColor;
import androidx.car.app.notification.CarAppExtender;
import androidx.car.app.utils.CommonUtils;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationChannelGroupCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.waze.R;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarNotificationManager {
    private final Context mContext;
    private final NotificationManagerCompat mNotificationManagerCompat;
    private final Integer mPrimaryColor;
    private final Integer mPrimaryColorDark;
    private final Integer mSecondaryColor;
    private final Integer mSecondaryColorDark;

    /* compiled from: WazeSource */
    final class Api29Impl {
        private Api29Impl() {
        }

        static void convertActionsToCompatActions(NotificationCompat.Builder builder, List<Notification.Action> list) {
            if (list.isEmpty()) {
                return;
            }
            builder.clearActions();
            Iterator<Notification.Action> it = list.iterator();
            while (it.hasNext()) {
                builder.addAction(fromAndroidAction(it.next()));
            }
        }

        private static NotificationCompat.Action fromAndroidAction(Notification.Action action) {
            return new NotificationCompat.Action(action.getIcon() == null ? 0 : action.getIcon().getResId(), action.title, action.actionIntent);
        }
    }

    private CarNotificationManager(Context context) throws PackageManager.NameNotFoundException {
        Context context2 = (Context) Objects.requireNonNull(context);
        this.mContext = context2;
        this.mNotificationManagerCompat = NotificationManagerCompat.from(context);
        Context contextCreateConfigurationContext = context2.createConfigurationContext(context.getResources().getConfiguration());
        int iLoadThemeId = loadThemeId(context);
        if (iLoadThemeId != 0) {
            contextCreateConfigurationContext.setTheme(iLoadThemeId);
        }
        Resources.Theme theme = contextCreateConfigurationContext.getTheme();
        Resources resources = theme.getResources();
        this.mPrimaryColor = getColor(resources.getIdentifier("carColorPrimary", "attr", context.getPackageName()), theme);
        this.mPrimaryColorDark = getColor(resources.getIdentifier("carColorPrimaryDark", "attr", context.getPackageName()), theme);
        this.mSecondaryColor = getColor(resources.getIdentifier("carColorSecondary", "attr", context.getPackageName()), theme);
        this.mSecondaryColorDark = getColor(resources.getIdentifier("carColorSecondaryDark", "attr", context.getPackageName()), theme);
    }

    public static CarNotificationManager from(Context context) {
        return new CarNotificationManager((Context) Objects.requireNonNull(context));
    }

    private static Integer getColor(int i2, Resources.Theme theme) {
        if (i2 == 0) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i2});
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0));
        typedArrayObtainStyledAttributes.recycle();
        return numValueOf;
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        return NotificationManagerCompat.getEnabledListenerPackages((Context) Objects.requireNonNull(context));
    }

    private static int loadThemeId(Context context) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("androidx.car.app.theme");
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private Notification updateForAutomotive(NotificationCompat.Builder builder) {
        Integer colorInt;
        CarAppExtender carAppExtender = new CarAppExtender(builder.build());
        Api29Impl.convertActionsToCompatActions(builder, carAppExtender.getActions());
        CarColor color = carAppExtender.getColor();
        if (color != null && (colorInt = getColorInt(color)) != null) {
            builder.setColorized(true);
            builder.setColor(colorInt.intValue());
        }
        PendingIntent contentIntent = carAppExtender.getContentIntent();
        if (contentIntent != null) {
            builder.setContentIntent(contentIntent);
        }
        CharSequence contentTitle = carAppExtender.getContentTitle();
        if (contentTitle != null) {
            builder.setContentTitle(contentTitle);
        }
        CharSequence contentText = carAppExtender.getContentText();
        if (contentText != null) {
            builder.setContentText(contentText);
        }
        PendingIntent deleteIntent = carAppExtender.getDeleteIntent();
        if (deleteIntent != null) {
            builder.setDeleteIntent(deleteIntent);
        }
        String channelId = carAppExtender.getChannelId();
        if (channelId != null) {
            builder.setChannelId(channelId);
        }
        Bitmap largeIcon = carAppExtender.getLargeIcon();
        if (largeIcon != null) {
            builder.setLargeIcon(largeIcon);
        }
        int smallIcon = carAppExtender.getSmallIcon();
        if (smallIcon != 0) {
            builder.setSmallIcon(smallIcon);
        }
        return builder.build();
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManagerCompat.areNotificationsEnabled();
    }

    public void cancel(int i2) {
        this.mNotificationManagerCompat.cancel(i2);
    }

    public void cancelAll() {
        this.mNotificationManagerCompat.cancelAll();
    }

    public void createNotificationChannel(NotificationChannelCompat notificationChannelCompat) {
        this.mNotificationManagerCompat.createNotificationChannel((NotificationChannelCompat) Objects.requireNonNull(notificationChannelCompat));
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat notificationChannelGroupCompat) {
        this.mNotificationManagerCompat.createNotificationChannelGroup((NotificationChannelGroupCompat) Objects.requireNonNull(notificationChannelGroupCompat));
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroupCompat> list) {
        this.mNotificationManagerCompat.createNotificationChannelGroupsCompat((List) Objects.requireNonNull(list));
    }

    public void createNotificationChannels(List<NotificationChannelCompat> list) {
        this.mNotificationManagerCompat.createNotificationChannelsCompat((List) Objects.requireNonNull(list));
    }

    public void deleteNotificationChannel(String str) {
        this.mNotificationManagerCompat.deleteNotificationChannel((String) Objects.requireNonNull(str));
    }

    public void deleteNotificationChannelGroup(String str) {
        this.mNotificationManagerCompat.deleteNotificationChannelGroup((String) Objects.requireNonNull(str));
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        this.mNotificationManagerCompat.deleteUnlistedNotificationChannels((Collection) Objects.requireNonNull(collection));
    }

    Integer getColorInt(CarColor carColor) {
        int i2 = this.mContext.getResources().getConfiguration().uiMode & 48;
        int type = carColor.getType();
        if (type == 0) {
            return Integer.valueOf(i2 == 32 ? carColor.getColorDark() : carColor.getColor());
        }
        switch (type) {
            case 2:
                return i2 == 32 ? this.mPrimaryColorDark : this.mPrimaryColor;
            case 3:
                return i2 == 32 ? this.mSecondaryColorDark : this.mSecondaryColor;
            case 4:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorRed));
            case 5:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorGreen));
            case 6:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorBlue));
            case 7:
                return Integer.valueOf(this.mContext.getResources().getColor(R.color.carColorYellow));
            default:
                return null;
        }
    }

    public int getImportance() {
        return this.mNotificationManagerCompat.getImportance();
    }

    public NotificationChannelCompat getNotificationChannel(String str, String str2) {
        return this.mNotificationManagerCompat.getNotificationChannelCompat((String) Objects.requireNonNull(str), (String) Objects.requireNonNull(str2));
    }

    public NotificationChannelGroupCompat getNotificationChannelGroup(String str) {
        return this.mNotificationManagerCompat.getNotificationChannelGroupCompat((String) Objects.requireNonNull(str));
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroups() {
        return this.mNotificationManagerCompat.getNotificationChannelGroupsCompat();
    }

    public List<NotificationChannelCompat> getNotificationChannels() {
        return this.mNotificationManagerCompat.getNotificationChannelsCompat();
    }

    public void notify(int i2, NotificationCompat.Builder builder) {
        this.mNotificationManagerCompat.notify(i2, updateForCar((NotificationCompat.Builder) Objects.requireNonNull(builder)));
    }

    Notification updateForCar(NotificationCompat.Builder builder) {
        if (CommonUtils.isAutomotiveOS(this.mContext)) {
            return updateForAutomotive(builder);
        }
        if (!CarAppExtender.isExtended(builder.build())) {
            builder.extend(new CarAppExtender.Builder().build());
        }
        return builder.build();
    }

    public void cancel(String str, int i2) {
        this.mNotificationManagerCompat.cancel(str, i2);
    }

    public void notify(String str, int i2, NotificationCompat.Builder builder) {
        this.mNotificationManagerCompat.notify(str, i2, updateForCar((NotificationCompat.Builder) Objects.requireNonNull(builder)));
    }

    public NotificationChannelCompat getNotificationChannel(String str) {
        return this.mNotificationManagerCompat.getNotificationChannelCompat((String) Objects.requireNonNull(str));
    }
}
