.class public final LK8/F;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LK8/F;


# instance fields
.field public final a:LK8/x;

.field public final b:LE4/F;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK8/F;

    .line 2
    .line 3
    invoke-direct {v0}, LK8/F;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK8/F;->c:LK8/F;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, LK8/x;->d:LK8/x;

    .line 2
    .line 3
    sget-object v1, LE4/F;->d:LE4/F;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, LE4/F;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {v1, v2}, LE4/F;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-boolean v2, v1, LE4/F;->b:Z

    .line 15
    .line 16
    sput-object v1, LE4/F;->d:LE4/F;

    .line 17
    .line 18
    :cond_0
    sget-object v1, LE4/F;->d:LE4/F;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LK8/F;->a:LK8/x;

    .line 24
    .line 25
    iput-object v1, p0, LK8/F;->b:LE4/F;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/FragmentActivity;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK8/F;->a:LK8/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "com.google.firebase.auth.internal.ProcessDeathHelper"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, LK8/x;->d(Landroid/content/SharedPreferences;)V

    .line 14
    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    iput-wide v1, v0, LK8/x;->b:J

    .line 19
    .line 20
    return-void
.end method
