// automatically generated by the FlatBuffers compiler, do not modify

package CSProto;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ShakeOfflineR extends Table {
  public static ShakeOfflineR getRootAsShakeOfflineR(ByteBuffer _bb) { return getRootAsShakeOfflineR(_bb, new ShakeOfflineR()); }
  public static ShakeOfflineR getRootAsShakeOfflineR(ByteBuffer _bb, ShakeOfflineR obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ShakeOfflineR __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int code() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String msg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer msgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer msgInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createShakeOfflineR(FlatBufferBuilder builder,
      int code,
      int msgOffset) {
    builder.startObject(2);
    ShakeOfflineR.addMsg(builder, msgOffset);
    ShakeOfflineR.addCode(builder, code);
    return ShakeOfflineR.endShakeOfflineR(builder);
  }

  public static void startShakeOfflineR(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addCode(FlatBufferBuilder builder, int code) { builder.addInt(0, code, 0); }
  public static void addMsg(FlatBufferBuilder builder, int msgOffset) { builder.addOffset(1, msgOffset, 0); }
  public static int endShakeOfflineR(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

