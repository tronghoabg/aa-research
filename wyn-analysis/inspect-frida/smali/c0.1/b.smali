.class public final Lc0/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# static fields
.field public static final j:Lc0/b;

.field public static final k:Lc0/b;

.field public static final l:Lc0/b;

.field public static final m:Lc0/b;


# instance fields
.field public final synthetic i:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc0/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lc0/b;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc0/b;->j:Lc0/b;

    .line 9
    .line 10
    new-instance v0, Lc0/b;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, v1, v2}, Lc0/b;-><init>(II)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lc0/b;->k:Lc0/b;

    .line 18
    .line 19
    new-instance v0, Lc0/b;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {v0, v1, v2}, Lc0/b;-><init>(II)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lc0/b;->l:Lc0/b;

    .line 27
    .line 28
    new-instance v0, Lc0/b;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v0, v1, v2}, Lc0/b;-><init>(II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lc0/b;->m:Lc0/b;

    .line 36
    .line 37
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lc0/b;->i:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lc0/b;->i:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_1
    const/4 v0, 0x0

    return-object v0

    :pswitch_2
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
