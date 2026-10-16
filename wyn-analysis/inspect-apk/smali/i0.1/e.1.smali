.class public final Li0/e;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# static fields
.field public static final j:Li0/e;

.field public static final k:Li0/e;

.field public static final l:Li0/e;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li0/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Li0/e;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li0/e;->j:Li0/e;

    .line 9
    .line 10
    new-instance v0, Li0/e;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Li0/e;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Li0/e;->k:Li0/e;

    .line 18
    .line 19
    new-instance v0, Li0/e;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, Li0/e;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Li0/e;->l:Li0/e;

    .line 27
    .line 28
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Li0/e;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Li0/e;->i:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Li0/f;

    .line 7
    .line 8
    invoke-direct {v0}, Li0/f;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Li0/a;

    .line 13
    .line 14
    invoke-direct {v0}, Li0/a;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_2
    new-instance v0, Le0/g;

    .line 22
    .line 23
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/graphics/PathMeasure;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Le0/g;-><init>(Landroid/graphics/PathMeasure;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
