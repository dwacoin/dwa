/*
 * Copyright © 2013-2016 The Nxt Core Developers.
 * Copyright © 2016-2017 Jelurida IP B.V.
 *
 * See the LICENSE.txt file at the top-level directory of this distribution
 * for licensing information.
 *
 * Unless otherwise agreed in a custom licensing agreement with Jelurida B.V.,
 * no part of the Nxt software, including this file, may be copied, modified,
 * propagated, or distributed except according to the terms contained in the
 * LICENSE.txt file.
 *
 * Removal or modification of this copyright notice is prohibited.
 *
 */

package dwa;

public final class Genesis {

    public static final long GENESIS_BLOCK_ID = -1801250834609507825L;
    public static final long CREATOR_ID = 1739068987193023818L;
    public static final byte[] CREATOR_PUBLIC_KEY = {
            18, 89, -20, 33, -45, 26, 48, -119, -115, 124, -47, 96, -97, -128, -39, 102,
            -117, 71, 120, -29, -39, 126, -108, 16, 68, -77, -97, 12, 68, -46, -27, 27
    };

    public static final long[] GENESIS_RECIPIENTS = {
            Long.parseUnsignedLong("3476145772027306708"),    
            Long.parseUnsignedLong("2957378486524627619"),
            Long.parseUnsignedLong("14783751340079555880"),
            Long.parseUnsignedLong("16773356556351692521"),
            Long.parseUnsignedLong("3075810344083402824"),
            Long.parseUnsignedLong("15785603189327232212"),
            Long.parseUnsignedLong("23438915295155133")
    };


    public static final long[] GENESIS_AMOUNTS = {
            6000000000000L,
            2000000000000L,
            400000000000L,
            400000000000L,
            400000000000L,
            400000000000L,
            400000000000L
    };

    public static final byte[][] GENESIS_SIGNATURES = {
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112},
            {64, 30, 27, -79, 32, 115, -104, -28, -53, 109, 120, 121, -115, -65, -87, 101, 23, 10, 64, 101, 29, 32, 56, 63, -23, -48, -51, 51, 16, -124, -41, 6, -71, 49, -20, 26, -57, 65, 49, 45, 7, 49, -126, 54, -64, -43, 1, -5, 111, 117, 104, 117, 126, 114, -77, 66, -127, -50, 69, 14, 70, 73, 60, 112}
    };

    public static final byte[] GENESIS_BLOCK_SIGNATURE = new byte[]{
            21, -24, 18, -61, -34, 53, -45, 42, 90, 103, -127, -128, 53, 101, 39, -63, -2, -32, 48, -83, 115, 47, -65, 118, 114, -62, 38, 109, 22, 106, 76, 8, -49, -113, -34, -76, 82, 79, -47, -76, -106, -69, -54, -85, 3, -6, 110, 103, 118, 15, 109, -92, 82, 37, 20, 2, 36, -112, 21, 72, 108, 72, 114, 17
    };

    private Genesis() {} // never

}
