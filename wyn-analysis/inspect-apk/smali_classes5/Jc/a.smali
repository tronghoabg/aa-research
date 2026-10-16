.class public final LJc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Landroid/content/IntentFilter;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Lmd/J;

.field public final c:Z

.field public final d:I

.field public e:I

.field public f:LA7/V1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "android.intent.action.CONFIGURATION_CHANGED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LJc/a;->g:Landroid/content/IntentFilter;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lmd/J;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJc/a;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, LJc/a;->b:Lmd/J;

    .line 7
    .line 8
    iput-boolean p3, p0, LJc/a;->c:Z

    .line 9
    .line 10
    iput p4, p0, LJc/a;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LJc/a;->b()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    :cond_0
    invoke-static {p1}, LA/f;->f(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/16 v0, 0x10e

    .line 12
    .line 13
    if-eqz p1, :cond_6

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq p1, v1, :cond_5

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    const/16 v2, 0xb4

    .line 20
    .line 21
    iget-boolean v3, p0, LJc/a;->c:Z

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-eq p1, v1, :cond_4

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq p1, v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    if-eqz v3, :cond_3

    .line 31
    .line 32
    :cond_2
    move v2, v4

    .line 33
    :cond_3
    :goto_0
    move v4, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_4
    if-eqz v3, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_5
    move v4, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_6
    const/16 v4, 0x5a

    .line 41
    .line 42
    :goto_1
    iget p1, p0, LJc/a;->d:I

    .line 43
    .line 44
    add-int/2addr v4, p1

    .line 45
    add-int/2addr v4, v0

    .line 46
    rem-int/lit16 v4, v4, 0x168

    .line 47
    .line 48
    return v4
.end method

.method public final b()I
    .locals 4

    .line 1
    iget-object v0, p0, LJc/a;->a:Landroid/app/Activity;

    .line 2
    .line 3
    const-string v1, "window"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/view/WindowManager;

    .line 10
    .line 11
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eq v0, v3, :cond_3

    .line 32
    .line 33
    if-eq v0, v2, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x4

    .line 42
    return v0

    .line 43
    :cond_2
    :goto_0
    const/4 v0, 0x3

    .line 44
    return v0

    .line 45
    :cond_3
    if-eqz v1, :cond_5

    .line 46
    .line 47
    if-ne v1, v3, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    return v2

    .line 51
    :cond_5
    :goto_1
    return v3
.end method

.method public final c(I)I
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, LJc/a;->b()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    :cond_0
    invoke-static {p1}, LA/f;->f(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p1, v1, :cond_3

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v1, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq p1, v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/16 v0, 0x5a

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    const/16 v0, 0x10e

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    const/16 v0, 0xb4

    .line 31
    .line 32
    :cond_4
    :goto_0
    iget-boolean p1, p0, LJc/a;->c:Z

    .line 33
    .line 34
    if-eqz p1, :cond_5

    .line 35
    .line 36
    mul-int/lit8 v0, v0, -0x1

    .line 37
    .line 38
    :cond_5
    iget p1, p0, LJc/a;->d:I

    .line 39
    .line 40
    add-int/2addr v0, p1

    .line 41
    add-int/lit16 v0, v0, 0x168

    .line 42
    .line 43
    rem-int/lit16 v0, v0, 0x168

    .line 44
    .line 45
    return v0
.end method
