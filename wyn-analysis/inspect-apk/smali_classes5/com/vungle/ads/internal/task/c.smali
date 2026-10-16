.class public final Lcom/vungle/ads/internal/task/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/vungle/ads/internal/task/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/vungle/ads/internal/util/PathProvider;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/vungle/ads/internal/task/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/vungle/ads/internal/task/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pathProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/vungle/ads/internal/task/c;->b:Lcom/vungle/ads/internal/util/PathProvider;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Lcom/vungle/ads/internal/task/h;)I
    .locals 2

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jobRunner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p2, p0, Lcom/vungle/ads/internal/task/c;->b:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {p2}, Lcom/vungle/ads/internal/util/PathProvider;->getVmDir()Ljava/io/File;

    move-result-object p2

    .line 2
    const-string v0, "AD_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/vungle/ads/internal/task/c;->b:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {v0, p1}, Lcom/vungle/ads/internal/util/PathProvider;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 4
    :goto_0
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string v0, "CleanupJob"

    const-string v1, "CleanupJob: Current directory snapshot"

    invoke-static {v0, v1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :try_start_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/vungle/ads/internal/task/c;->a()V

    .line 7
    const-string p2, "omsdk.js"

    const-string v0, "omsdk-session.js"

    filled-new-array {p2, v0}, [Ljava/lang/String;

    move-result-object p2

    .line 8
    invoke-static {p2}, Lff/m;->P0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    .line 9
    invoke-static {p1, p2}, Lcom/vungle/ads/internal/util/n;->b(Ljava/io/File;Ljava/util/Set;)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-static {p1}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    const/4 p1, 0x0

    return p1

    :catch_0
    const/4 p1, 0x1

    return p1
.end method

.method public final a()V
    .locals 9

    .line 11
    iget-object v0, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    .line 12
    sget-object v1, Lef/j;->a:Lef/j;

    new-instance v2, Lcom/vungle/ads/internal/task/b;

    invoke-direct {v2, v0}, Lcom/vungle/ads/internal/task/b;-><init>(Landroid/content/Context;)V

    invoke-static {v1, v2}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    move-result-object v0

    .line 13
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/vungle/ads/internal/persistence/FilePreferences;

    .line 14
    const-string v2, "VERSION_CODE"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Lcom/vungle/ads/internal/persistence/FilePreferences;->a(Ljava/lang/String;I)I

    move-result v1

    const v3, 0x11430

    if-ge v1, v3, :cond_7

    const v4, 0x11170

    const-string v5, "CleanupJob"

    if-ge v1, v4, :cond_2

    .line 15
    sget-boolean v4, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string v4, "CleanupJob: drop old files data"

    invoke-static {v5, v4}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    new-instance v4, Ljava/io/File;

    iget-object v6, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v6

    const-string v7, "vungle_db"

    invoke-direct {v4, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 18
    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    .line 19
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-journal"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    goto :goto_0

    .line 20
    :cond_0
    iget-object v4, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-virtual {v4, v7}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 21
    :goto_0
    iget-object v4, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    const/4 v6, 0x0

    const-string v7, "com.vungle.sdk"

    invoke-virtual {v4, v7, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 22
    const-string v6, "cache_path"

    const/4 v7, 0x0

    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 23
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x18

    if-lt v7, v8, :cond_1

    .line 24
    iget-object v4, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-static {v4}, LA7/O0;->p(Landroid/content/Context;)V

    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 26
    const-string v7, "editor"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 28
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 29
    :goto_1
    iget-object v4, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v7, "context.noBackupFilesDir"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v7, Ljava/io/File;

    const-string v8, "vungle_settings"

    invoke-direct {v7, v4, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    invoke-static {v7}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    if-eqz v6, :cond_2

    .line 32
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    :cond_2
    const v4, 0x111d4

    if-ge v1, v4, :cond_3

    .line 33
    new-instance v4, Ljava/io/File;

    .line 34
    iget-object v6, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 35
    const-string v7, "vungle"

    invoke-direct {v4, v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    :cond_3
    const v4, 0x1129d

    if-ge v1, v4, :cond_4

    .line 37
    :try_start_0
    new-instance v4, Ljava/io/File;

    iget-object v6, p0, Lcom/vungle/ads/internal/task/c;->b:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {v6}, Lcom/vungle/ads/internal/util/PathProvider;->a()Ljava/io/File;

    move-result-object v6

    const-string v7, "vungleSettings"

    invoke-direct {v4, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    .line 38
    new-instance v4, Ljava/io/File;

    iget-object v6, p0, Lcom/vungle/ads/internal/task/c;->b:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {v6}, Lcom/vungle/ads/internal/util/PathProvider;->a()Ljava/io/File;

    move-result-object v6

    const-string v7, "failedTpatSet"

    invoke-direct {v4, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v4

    .line 39
    sget-boolean v6, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string v6, "Failed to delete temp data"

    invoke-static {v5, v6, v4}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    const v4, 0x11364

    if-ge v1, v4, :cond_5

    .line 40
    iget-object v4, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v4

    .line 41
    :try_start_1
    new-instance v6, Ljava/io/File;

    const-string v7, "failedTpats"

    invoke-direct {v6, v4, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    .line 42
    new-instance v6, Ljava/io/File;

    const-string v7, "failedGenericTpats"

    invoke-direct {v6, v4, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v4

    .line 43
    sget-boolean v6, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string v6, "Failed to delete 742 tpat data"

    invoke-static {v5, v6, v4}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    const v4, 0x113c8

    if-ge v1, v4, :cond_6

    .line 44
    iget-object v1, p0, Lcom/vungle/ads/internal/task/c;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v1

    .line 45
    :try_start_2
    new-instance v4, Ljava/io/File;

    const-string v6, "vungle_cache/downloads"

    invoke-direct {v4, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V

    .line 46
    new-instance v4, Ljava/io/File;

    const-string v6, "vungle_cache/js"

    invoke-direct {v4, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception v1

    .line 47
    sget-boolean v4, Lcom/vungle/ads/internal/util/u;->a:Z

    const-string v4, "Failed to delete 750 data"

    invoke-static {v5, v4, v1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    :cond_6
    :goto_4
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/vungle/ads/internal/persistence/FilePreferences;

    .line 49
    invoke-virtual {v0, v2, v3}, Lcom/vungle/ads/internal/persistence/FilePreferences;->b(Ljava/lang/String;I)Lcom/vungle/ads/internal/persistence/FilePreferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vungle/ads/internal/persistence/FilePreferences;->b()V

    :cond_7
    return-void
.end method
