.class public final synthetic LJ9/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/G;

.field public final synthetic c:LN9/h;


# direct methods
.method public synthetic constructor <init>(LJ9/G;LN9/h;I)V
    .locals 0

    .line 1
    iput p3, p0, LJ9/E;->a:I

    iput-object p1, p0, LJ9/E;->b:LJ9/G;

    iput-object p2, p0, LJ9/E;->c:LN9/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LJ9/E;->a:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lz9/t;->d:Lz9/t;

    .line 9
    .line 10
    iget-object v1, p0, LJ9/E;->c:LN9/h;

    .line 11
    .line 12
    iget-object v2, p0, LJ9/E;->b:LJ9/G;

    .line 13
    .line 14
    invoke-virtual {v2, v1, p1}, LJ9/G;->a(LN9/h;Ljava/lang/String;)Lz9/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v0}, Lz9/b;->e(Lz9/t;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lz9/c;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, v2, LJ9/G;->a:LB8/b;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, LB8/b;->b([B)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    sget-object v0, Lz9/t;->c:Lz9/t;

    .line 38
    .line 39
    iget-object v1, p0, LJ9/E;->c:LN9/h;

    .line 40
    .line 41
    iget-object v2, p0, LJ9/E;->b:LJ9/G;

    .line 42
    .line 43
    invoke-virtual {v2, v1, p1}, LJ9/G;->a(LN9/h;Ljava/lang/String;)Lz9/b;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, v0}, Lz9/b;->e(Lz9/t;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lz9/c;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, v2, LJ9/G;->a:LB8/b;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, LB8/b;->b([B)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
