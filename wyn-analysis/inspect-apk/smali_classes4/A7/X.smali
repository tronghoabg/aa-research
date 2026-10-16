.class public final LA7/X;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LA7/X;->d:Z

    .line 7
    const-string v0, "firestore.googleapis.com"

    iput-object v0, p0, LA7/X;->a:Ljava/lang/String;

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, LA7/X;->b:Z

    .line 9
    iput-boolean v0, p0, LA7/X;->c:Z

    return-void
.end method

.method public constructor <init>(LA7/Z;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/X;->e:Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, LA7/X;->a:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, LA7/X;->b:Z

    return-void
.end method


# virtual methods
.method public a()Lm9/H;
    .locals 2

    .line 1
    iget-boolean v0, p0, LA7/X;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LA7/X;->a:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "firestore.googleapis.com"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "You can\'t set the \'sslEnabled\' setting unless you also set a non-default \'host\'."

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    :goto_0
    new-instance v0, Lm9/H;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lm9/H;-><init>(LA7/X;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public b(Lm9/P;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LA7/X;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p1, Lm9/Q;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p1, Lm9/T;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Only MemoryCacheSettings and PersistentCacheSettings are accepted"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iput-object p1, p0, LA7/X;->e:Ljava/lang/Object;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first."

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public c(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LA7/X;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/Z;

    .line 4
    .line 5
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, LA7/X;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 19
    .line 20
    .line 21
    iput-boolean p1, p0, LA7/X;->d:Z

    .line 22
    .line 23
    return-void
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, LA7/X;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LA7/X;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, LA7/X;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LA7/Z;

    .line 11
    .line 12
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LA7/X;->a:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v2, p0, LA7/X;->b:Z

    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput-boolean v0, p0, LA7/X;->d:Z

    .line 25
    .line 26
    :cond_0
    iget-boolean v0, p0, LA7/X;->d:Z

    .line 27
    .line 28
    return v0
.end method
