.class public final synthetic Lr9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr9/l;


# direct methods
.method public synthetic constructor <init>(Lr9/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr9/d;->a:I

    iput-object p1, p0, Lr9/d;->b:Lr9/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lr9/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/d;->b:Lr9/l;

    .line 7
    .line 8
    iget-object v0, v0, Lr9/l;->f:LVa/Za;

    .line 9
    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lr9/d;->b:Lr9/l;

    .line 12
    .line 13
    iget-object v0, v0, Lr9/l;->b:Lr9/f;

    .line 14
    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
