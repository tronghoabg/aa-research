.class public final LA7/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LA7/i1;


# direct methods
.method public synthetic constructor <init>(LA7/i1;I)V
    .locals 0

    .line 1
    iput p2, p0, LA7/k1;->a:I

    iput-object p1, p0, LA7/k1;->b:LA7/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LA7/k1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LA7/k1;->b:LA7/i1;

    .line 8
    .line 9
    iput-object v0, v1, LA7/i1;->j:LA7/j1;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LA7/k1;->b:LA7/i1;

    .line 13
    .line 14
    iget-object v1, v0, LA7/i1;->j:LA7/j1;

    .line 15
    .line 16
    iput-object v1, v0, LA7/i1;->e:LA7/j1;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
