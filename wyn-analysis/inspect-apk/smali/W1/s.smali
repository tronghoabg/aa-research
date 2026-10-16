.class public final synthetic LW1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LW1/s;->a:I

    iput-object p1, p0, LW1/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget v0, p0, LW1/s;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LW1/s;->b:Ljava/lang/Object;

    check-cast v0, Lorg/apache/tika/metadata/Metadata;

    invoke-static {v0, p1}, Lorg/apache/tika/parser/ParsingReader;->a(Lorg/apache/tika/metadata/Metadata;Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LW1/s;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
