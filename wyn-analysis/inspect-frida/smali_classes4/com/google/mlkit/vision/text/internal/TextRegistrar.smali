.class public Lcom/google/mlkit/vision/text/internal/TextRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 4

    .line 1
    const-class v0, LEa/h;

    .line 2
    .line 3
    invoke-static {v0}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Lya/g;

    .line 8
    .line 9
    invoke-static {v2}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, LL8/a;->c(LL8/l;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lm9/S;

    .line 17
    .line 18
    const/16 v3, 0x11

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lm9/S;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v2, v1, LL8/a;->g:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v1}, LL8/a;->d()LL8/b;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-class v2, LEa/g;

    .line 30
    .line 31
    invoke-static {v2}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v0}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v2, v0}, LL8/a;->c(LL8/l;)V

    .line 40
    .line 41
    .line 42
    const-class v0, Lya/d;

    .line 43
    .line 44
    invoke-static {v0}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v2, v0}, LL8/a;->c(LL8/l;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lwa/a;

    .line 52
    .line 53
    const/16 v3, 0x11

    .line 54
    .line 55
    invoke-direct {v0, v3}, Lwa/a;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iput-object v0, v2, LL8/a;->g:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v2}, LL8/a;->d()LL8/b;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzi(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method
