.class public final LEa/h;
.super Lya/e;
.source "SourceFile"


# instance fields
.field public final a:Lya/g;


# direct methods
.method public constructor <init>(Lya/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lya/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LEa/h;->a:Lya/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, LCa/h;

    .line 2
    .line 3
    invoke-interface {p1}, LCa/h;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzun;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, LEa/a;

    .line 12
    .line 13
    iget-object v2, p0, LEa/h;->a:Lya/g;

    .line 14
    .line 15
    invoke-virtual {v2}, Lya/g;->b()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Ld7/f;->b:Ld7/f;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Ld7/f;->a(Landroid/content/Context;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const v4, 0xc337960

    .line 29
    .line 30
    .line 31
    if-ge v3, v4, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, LCa/h;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v3, LA7/b0;

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-direct {v3, v2, v4}, LA7/b0;-><init>(Landroid/content/Context;I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    new-instance v3, LE5/l;

    .line 48
    .line 49
    invoke-direct {v3, v2, p1, v0}, LE5/l;-><init>(Landroid/content/Context;LCa/h;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-direct {v1, v0, v3, p1}, LEa/a;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;LEa/e;LCa/h;)V

    .line 53
    .line 54
    .line 55
    return-object v1
.end method
