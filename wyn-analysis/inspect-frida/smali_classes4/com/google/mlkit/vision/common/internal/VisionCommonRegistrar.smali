.class public Lcom/google/mlkit/vision/common/internal/VisionCommonRegistrar;
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
    .locals 5

    .line 1
    const-class v0, LBa/d;

    .line 2
    .line 3
    invoke-static {v0}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LL8/l;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    const-class v4, LBa/c;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3, v4}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, LL8/a;->c(LL8/l;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, LBa/d;->b:LBa/d;

    .line 20
    .line 21
    iput-object v1, v0, LL8/a;->g:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v0}, LL8/a;->d()LL8/b;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzp;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_common/zzp;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
